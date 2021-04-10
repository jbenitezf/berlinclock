package main;

import berlinclock.BerlinClock;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Jose Benitez
 */
public class Main {


    private static final String MINUTES = "minutes row";
    private static final String HOURS = "hours row";

    public static void main(String[] args){

            Date date = new Date();
            DateFormat formatHour = new SimpleDateFormat("HH:mm:ss");

            BerlinClock clock = new BerlinClock(formatHour.format(date));
            //System.out.println(clock.printRow(HOURS,4,2));
            clock.printclock();





    }
}
