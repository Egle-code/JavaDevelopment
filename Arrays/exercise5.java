package Arrays;

import java.util.Arrays;

public class exercise5 {
    public static void main(String[] args) {
        // write your code here
        int[] array = {1, 7, 3, 7, 10, 1, 9};
        System.out.print("Array: " + Arrays.toString(array) + " duplicate values: ");

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {

                System.out.printf("\n%d compared %d ", array[i], array[j]);

                if (array[i] == array[j]) {
                    System.out.print("\nFOUND: " + array[j] + " \n");

                }

            }
        }
    }}