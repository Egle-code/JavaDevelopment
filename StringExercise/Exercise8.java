package StringExercise;

public class Exercise8 {
    public static void main(String[] args) {
        String string1 = "This is a comparison";
        String string2 = "THIS is A Comparison";
        System.out.println("Printing strings comparison: " + string1 + " - " + string2);

        if (string1.equalsIgnoreCase(string2)) {
            System.out.printf("The strings (\"%s\", \"%s\") are lexicographically equal!", string1, string2);
        } else {
            System.out.printf("The strings (\"%s\", \"%s\") are not lexicographically equal!", string1, string2);

}}}
