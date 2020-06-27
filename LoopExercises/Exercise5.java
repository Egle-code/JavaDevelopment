package LoopExercises;

public class Exercise5 {
    public static void main(String[] args) {
        int number = 3;
        int threshold = 100;
        System.out.printf("Powers of number %d up to %d: ", number, threshold);

        for (int i = number; i < threshold; i = i * number) {
            System.out.print(i + " ");
    }

}}
