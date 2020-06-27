package Arrays;

import java.util.Arrays;

public class exercise8 {

    public static void main(String[] args){

        int[] array = {1, 7, 3, 10, 9};

        Integer[] newArray = new Integer[array.length + 1];


        int position = 2;
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }

        Integer value = 4;
        newArray[position] = value;

        for (int i = array.length; i > position; i--) {
            newArray[i] = array[i - 1];
        }
        System.out.println(Arrays.toString(array) + " -> " + Arrays.toString(newArray));

    }}
