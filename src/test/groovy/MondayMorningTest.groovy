import spock.lang.Specification

class MondayMorningTest extends Specification {

    void sendNotification(){
        when:
        new MondayMorning().sendNotification()
        then:
        true
    }
}
