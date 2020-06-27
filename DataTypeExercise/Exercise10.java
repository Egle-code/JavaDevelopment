package DataTypeExercise;

public class Exercise10 {
    public static void main(String[] args) {
        // storing the original number in an additional variable because
        // it will degrade as we extract its last digits
        int number=133;
        int originalNumber = number;
        int sumDigits = 0;

        while (number > 0) {
            sumDigits = sumDigits + number % 10;
            number /= 10;
        }

        System.out.printf("Sum of number %d's digits is: %d", originalNumber, sumDigits);

}}
