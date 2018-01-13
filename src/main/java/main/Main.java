package main;

import berlinclock.BerlinClock;

/**
 * @author Jose Benitez
 */
public class Main {

    public static String TEST_HOUR = "12:23:00";


    public static void main(String[] args){

        BerlinClock clock = new BerlinClock(TEST_HOUR);
        System.out.println(clock.getHours());
        System.out.println(clock.getMinutes());
        System.out.println(clock.getSeconds());

    }
}
