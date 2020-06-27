package StringExercise;

public class Exercise6 {
    public static void main(String[] args) {

        String string1 = "Java";
        String string2 = "Fundamentals";
        System.out.println("Concatenating strings without first letter: " + string1 + " - " + string2);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(string1.substring(1))
                .append(string2.substring(1));

        System.out.println(stringBuilder.toString());
    }

}
