package Various.company;

public class countdown {

    
    public static void countup(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            countup(n - 1);
            System.out.println(n);
        }}
    public static void main(String[] args) {

    }}