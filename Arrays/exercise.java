package Arrays;

public class exercise {
    public static void main(String[] args) {
        // write your code here

        double[] myArray = {3, 2.5, -8, 11};
        // PRINT ALL ELEMENTS
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        // SUMMING ALL ELEMENTS
        double total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total = total + myArray[i];
        }
        System.out.print("Total is: " + total);
    }
    }

