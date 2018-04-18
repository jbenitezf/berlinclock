package berlinclock;

/**
 * @author Jose Benitez
 */
public class BerlinClock {

    private static final String YELLOW = "Y";
    private static final String RED = "R";
    private static final String OFF = "0";
    private static final String MINUTES = "minutes row";
    private static final String HOURS = "hours row";

    private static final String INVALID_LAMPS_ERROR = "Invalid number of lamps";


    private int hours;
    private int minutes;
    private int seconds;

    public BerlinClock(String time) {
        System.out.println("it is: " + time);
        preProcessTime(time);
    }

    private void preProcessTime(String time) {
        this.hours = Integer.parseInt(time.substring(0, 2));
        this.minutes = Integer.parseInt(time.substring(3, 5));
        this.seconds = Integer.parseInt(time.substring(6, 8));
    }

    private StringBuilder initializeRow(int numLamps){

        StringBuilder row;
        if(numLamps == 4){
            return row = new StringBuilder("0000");
        }else if(numLamps == 11){
            return row = new StringBuilder("00000000000");
        }else{
            throw new IllegalArgumentException(INVALID_LAMPS_ERROR);
        }
    }

    public StringBuilder printRow(String rowType, int numLamps, int onLamps) {

        StringBuilder row = initializeRow(numLamps);

        if(rowType == HOURS){
            for(int i=0 ; i<onLamps ; i++){
               row.setCharAt(i,'R');
            }
        }else if(rowType == MINUTES){
            for(int i=0 ; i<onLamps ; ++i){
                if((i==2 || i==5)&&numLamps == 11){
                    row.setCharAt(i,'R');
                }else{
                    row.setCharAt(i,'Y');
                }
            }
        }
        return row;
    }

    public String printSeconds(){
        String  lamp = (this.seconds % 2 == 0) ? "Y" : "0";
        return lamp;
    }


    public void printclock(){

        int numLampsOnRow2 = hours / 5;
        int numLampsOnRow3 = hours % 5;
        int numLampsOnRow4 = minutes / 5;
        int numLampsOnRow5 = minutes % 5;


        System.out.println(printSeconds());
        System.out.println(printRow(HOURS,4,numLampsOnRow2));
        System.out.println(printRow(HOURS,4,numLampsOnRow3));
        System.out.println(printRow(MINUTES,11,numLampsOnRow4));
        System.out.println(printRow(MINUTES,4,numLampsOnRow5));



    }


































}
