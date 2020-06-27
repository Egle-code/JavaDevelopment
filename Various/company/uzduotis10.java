package com.company;

import java.time.Year;

public class uzduotis10 {
    public static void main(String[] args) {
        // write your code here
        int year = 1;
        do {
            if ( year >= 1583 ) {
            // Danger: year++ and ++year
            System.out.printf("Year %d is a leap: %s\n", year,
                    isLeapYear( year ) &&
                            // Yes it is double &&, but works with single & too
                    Year.of( year ).isLeap());
        } else {
            System.out.println( String.format( "%s", year ) );
        }            year++;
        } while ( year <=Year.now().getValue() );
    }    public static boolean isLeapYear(int year) {
        assert year >= 1583; // not valid before this date.
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

    }
}
