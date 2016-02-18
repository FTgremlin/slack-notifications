import groovyx.net.http.HTTPBuilder

import static groovyx.net.http.ContentType.URLENC

class ThursdayCake {

    def host = 'https://hooks.slack.com'
    def path = System.getenv('HOME_CHANNEL')

    def text = '<!channel> Cake alert! Happy cake day, everybody!'
    def username = 'thursday-bot'
    def icon = ':cake:'

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
