package StringExercise;

public class Exercise5 {
    public static void main(String[] args) {
        String string = "Programmer";
        System.out.println("Printing first half of string: " + string);

        int stringLength = string.length();
        String firstHalf = string.substring(0, stringLength/2);

        System.out.println(firstHalf);


}}
