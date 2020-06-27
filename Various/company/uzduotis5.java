package com.company;

public class uzduotis5 {
    public static void main(String[] args) {
        // write your code here
        int x = 0;
        System.out.println(x);    //0
        System.out.println(++x);  //1
        System.out.println(x);    //1
        System.out.println(x--);  //1
        System.out.println(x);    //0
        int a = ++x + x-- + x++ - --x;
        System.out.println(a);    //2
    }
}
