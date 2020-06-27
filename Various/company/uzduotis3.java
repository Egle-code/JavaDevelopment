package com.company;

public class uzduotis3 {

    public static void main(String[] args) {
        // write your code here
        int temperature = 80;
        System.out.println("Temperature = " + temperature + "");
        if (temperature > 100){
            System.out.println("The water " +
                    "will boil");
        } else {
            System.out.println("The water " +
                    "isn't boiling");
        }
        if (temperature > 100) {
            System.out.println("The water" +
                    "will boil");
        } else if(temperature > 50) {
            System.out.println("The water" +
                    "is getting hotter");
        }

    }
}
