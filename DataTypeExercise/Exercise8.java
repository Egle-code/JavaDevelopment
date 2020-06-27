package DataTypeExercise;

public class Exercise8 {

    public static void main(String[] args) {
        int a = 5, b = 13;

        //Temporary // save it // Scope demo: c
        System.out.println("before a = " + a + "; b = " + b);

        //  System.out.println("Initialized : c " + c + "/n");

        //Change values:minimal scope
        {
            int c = a;
            a = b;
            b = c;
        }
        System.out.println("after a = " + a + "; b = " + b );
    }}

