package LoopExercises;

public class Exercise6 {
    public static void main(String[] args) {
        int threshold = 10;
        System.out.printf("Fibonacci series of %d terms: ", threshold);

        int secondToLast = 0;
        int last = 1;
        int counter = 2;

        System.out.print(secondToLast + " " + last + " ");

        while (counter < threshold) {
            int current = secondToLast + last;
            secondToLast = last;
            last = current;

            System.out.print(last + " ");
            counter++;

    }

}}
