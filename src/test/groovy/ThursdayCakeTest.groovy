import spock.lang.Specification

class ThursdayCakeTest extends Specification {

    void sendNotification(){
        when:
        new ThursdayCake().sendNotification()
        then:
        true
    }
}
