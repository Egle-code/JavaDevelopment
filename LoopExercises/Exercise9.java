package LoopExercises;

public class Exercise9 {
    public static void main(String[] args) {
        int number = 4;
        int increment = number;

        System.out.printf("First %d numbers (incremented by %d): %d ", number, number, number);

        for (int i = 2; i <= increment; i++) {
            number = number + increment;

            System.out.print(number + " ");
    }

}}
