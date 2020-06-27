package LoopExercises;

public class Exercise7 {
    public static void main(String[] args) {
        int it = 1;

        int threshold = 9;
        for (int i = 1; i <= threshold; i++) {
            for (int j = 1; j <= threshold - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < it; j++) {
                System.out.print(i);
            }
            System.out.println("");
            it += 2;

    }

}}
