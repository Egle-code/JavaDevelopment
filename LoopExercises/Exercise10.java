package LoopExercises;

public class Exercise10 {
    public static void main(String[] args) {
        int factorial = 1;

        int number = 5;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.printf("Factorial of %d is: %d\n\n", number, factorial);
    }

}
