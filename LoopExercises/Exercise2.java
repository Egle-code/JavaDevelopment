package LoopExercises;

public class Exercise2 {
    public static void main(String[] args) {
        int threshold = 100;
        System.out.printf("Even numbers up to %d: ", threshold);

        for (int i = 1; i <= threshold; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
    }

}}
