package Arrays;

public class  uzduotis5 {
    public static void main(String[] args) {
        // write your code here

        int[] array = {10,25,30,45};
        int sum = 0;
        for(int i = 0; i<array.length; i++) {
            sum+= array [i];
        }
        System.out.printf("Masyvo elementu suma bus %d\n", sum);
    }

}
