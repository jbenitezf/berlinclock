package berlinclock;

/**
 * @author Jose Benitez
 */
public class BerlinClock {

    private String hours;
    private String minutes;
    private String seconds;
    
 
    public BerlinClock(String time){
        convertTimeToTimes(time);
    }

    private void convertTimeToTimes(String time){

        this.hours = time.substring(0,2);
        this.minutes = time.substring(3,5);
        this.seconds = time.substring(6,8);
    }

    public String getHours() {
        return hours;
    }

    public String getMinutes() {
        return minutes;
    }

    public String getSeconds() {
        return seconds;
    }
}
