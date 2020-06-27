package LoopExercises;

public class Exercise3 {
    public static void main(String[] args) {
        int number = 5;
        System.out.print(number + " => " + number + " ");

        int previous = number;
        for (int i = 1; i <= number; i++) {
            int current = (int) (number * Math.pow(10, i) + previous);
            System.out.printf(current + " ");
            previous = current;

    }

}}
