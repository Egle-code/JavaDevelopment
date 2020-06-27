package LoopExercises;

public class Exercise8 {
    public static void main(String[] args) {
        int threshold = 4;
        System.out.printf("First %d prime numbers: ", threshold);

        int primeNumbersCount = 1;
        int numberToCheck = 2;

        while (primeNumbersCount <= threshold) {
            if (isPrime(numberToCheck)) {
                primeNumbersCount++;
                System.out.print(numberToCheck + " ");
            }
            numberToCheck++;
    }

}


    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
