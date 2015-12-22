import groovyx.net.http.HTTPBuilder
import static groovyx.net.http.ContentType.URLENC

class MondayMorning {

    def host = 'https://hooks.slack.com'
    def path = System.getenv('HOME_CHANNEL')

    def text = '<!channel> Good morning everyone, and happy Monday!'
    def username = 'monday-bot'
    def icon = ':unicorn_face:'

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
        new SlackMessage(text:text, username:username, icon_emoji:icon).payload()
    }

}
