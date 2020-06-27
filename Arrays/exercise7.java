package Arrays;

import java.util.Arrays;

public class exercise7 {

    public static void main(String[] args) {


        int[] array = {1, 2, 7, 3, 10, 2, 9};
        int sum =4;
        {
            System.out.println("Pairs of elements in array " + Arrays.toString(array) +
                    " with sum: " + sum + " are: ");

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == sum) {
                        System.out.println(array[i] + "-" + array[j] + " ");
                    }
                }
            }
        }
    }
}