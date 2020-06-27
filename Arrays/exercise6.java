package Arrays;

import java.util.Arrays;

public class exercise6 {
    public static void main(String[] args) {
        // write your code here
        int[] array = {7, 1, 3, 10, 9};
        int max = array[0];
        int secondMax = max;

        for (Integer i : array) {
            if (i > max) {
                max = i;
            }
            if (i > secondMax && i < max) {
                secondMax = i;
            }
        }

        System.out.println("Second largest element in array " +
                Arrays.toString(array) + " is: " + secondMax);

}}
