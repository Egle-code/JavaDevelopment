package Arrays;

public class exercise1{
    public static void main(String[] args) {
        // write your code here
        int[] array = {7, 1, 3, 10, 9};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+= array [i];
            System.out.printf("Suma yra %d\n", sum);
        }
        int average;
        {
            average = 0;
            average = sum / array.length;
        }
        System.out.printf("Vidurkis yra " + average);


    }
}
