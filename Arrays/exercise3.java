package Arrays;

import java.io.PrintStream;
import java.util.Arrays;

public class exercise3 {
    public static void main(String[] args) {
        // write your code here
        int[] myArray = {7, 1, 3, 10, 9} ;
        {
            System.out.println("Eilė prieš pasikeitimą: " + Arrays.toString(myArray));
            System.out.println("Eilė po pakeitimo: ");
            for ( int i = myArray.length-1; i>=0; i-- ) {
                System.out.print( myArray[ i ] + " " );
            }
        }
    }

}

