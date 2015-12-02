
class FridayTimesheetTest extends spock.lang.Specification {

    void testSomething(){
        when:
        new FridayTimesheet().sendNotification()
        then:
        true
    }

}
