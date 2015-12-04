import groovyx.net.http.HTTPBuilder
import static groovyx.net.http.ContentType.URLENC

class FridayTimesheet {

    def host = 'https://hooks.slack.com'
    def path = System.getenv('HOME_CHANNEL')

    def text = '<!channel> do your timesheets today or else.'
    def username = 'timesheet-bot'
    def iconSelection = [':timer_clock:',':minion_straight:',':panic:',':rabbitfocus:']

    def randomiseIcon(){
        def arraySize = iconSelection.size()
        iconSelection[new Random().nextInt()%arraySize]
    }

    void sendNotification(){
        def http = new HTTPBuilder(host)
        def postBody = createPayload()

        http.post(path:path, body: postBody,
        requestContentType: URLENC) { resp ->

            println "POST Success: ${resp.statusLine}"
            assert resp.statusLine.statusCode == 200
        }
    }

    String createPayload(){
        new SlackMessage(text:text, username:username, icon_emoji:randomiseIcon()).payload()
    }

}
