package com.company;

public class uzduotis4 {
    public static void main(String[] args) {
        // write your code here
          int a = 15, b = 25;

        //Temporary // save it // Scope demo: c
        System.out.println("before a = " + a + "b = " + b);

      //  System.out.println("Initialized : c " + c + "/n");

        //Change values:minimal scope
        {
            int c = a;
            a = b;
            b = c;
        }
    System.out.println("after a = " + a + "b = " + b );
    }}

