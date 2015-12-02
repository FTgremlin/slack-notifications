import org.junit.Test

class FridayTimesheetTest extends spock.lang.Specification {

    @Test
    void testSomething(){
        when:
        new FridayTimesheet().sendNotification()
        then:
        true
    }

}
