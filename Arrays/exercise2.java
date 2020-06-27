package Arrays;

public class exercise2 {
    public static void main(String[] args) {
        // write your code here
        int[] myArray = {7, 1, 3, 10, 9} ;
        int odd = 0;
        int even = 0;
        for (int item : myArray) {
            if (item % 2 != 0) {
                System.out.printf("%d yra ne lyginis.\n", item);
                odd++;
            } else {
                even++;
                System.out.printf("%d yra lyginis.\n", item);
            }
        }
        System.out.printf("Lyginiu skaiciu: %d. Nelyginiu skaiciu: %d\n", even, odd);
    }

}
