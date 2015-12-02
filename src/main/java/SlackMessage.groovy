import groovy.json.JsonOutput

class SlackMessage {

    def text
    def username
    def icon_emoji

    String payload(){
        JsonOutput.toJson(this)
    }

}
