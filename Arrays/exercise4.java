package Arrays;

public class exercise4 {
    public static void main(String[] args) {
        // write your code here
        int[] myArray = {7, 1, 3, 10, 9} ;
        int odd = 0;
        int even = 0;
        for (int item : myArray) {
            if (item % 2 != 0) {
                odd++;
            } else {
                even++;
            }
        }
        System.out.printf("Lyginiu skaiciu: %d. Nelyginiu skaiciu: %d\n", even, odd);

    }

}
