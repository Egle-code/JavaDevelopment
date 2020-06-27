package StringExercise;

public class Exercise9 {
    public static void main(String[] args) {

        String string1 = "Java exercises";
        String string2 = "ses";
        System.out.println("Printing if string ends with: " + string1 + " - " + string2);

        String endOfString = string1.substring(string1.length() - string2.length());

        System.out.println( "OUT: " + endOfString );

        if (endOfString.equalsIgnoreCase(string2)) {
            System.out.printf("The string \"%s\" ends with \"%s\"!", string1, string2);
        } else {
            System.out.printf("The string \"%s\" doesn't ends with \"%s\"!", string1, string2);
    }

}}
