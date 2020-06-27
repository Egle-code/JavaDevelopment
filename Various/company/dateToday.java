package Various.company;

import java.util.Date;

public class dateToday {

    public static void main(String[] args) {
        System.out.printf("The date is " +
                        " %1$tm ( %<tB ) / %<te ( %<tA ) / %<tY ",
                new Date());
    }}