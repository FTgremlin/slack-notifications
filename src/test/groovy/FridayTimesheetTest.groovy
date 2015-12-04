import spock.lang.Specification

class FridayTimesheetTest extends Specification {

    void sendNotification(){
        when:
        new FridayTimesheet().sendNotification()
        then:
        true
    }
}
