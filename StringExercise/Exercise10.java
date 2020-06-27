package StringExercise;

public class Exercise10 {
    public static void main(String[] args) {
        String string = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33";
        System.out.println("Printing string character count: " + string);

        int lettersCount = 0;
        int spacesCount = 0;
        int numbersCount = 0;
        int othersCount = 0;

        // Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33
        /*
         contains 23 letters, 9 spaces, 8 numbers, 6 others
        */

        for (int i=0; i<string.length(); i++) {
            if (string.substring(i,i+1).matches("[a-zA-Z]")) {
                lettersCount++;
                continue;
            } else

                // Whitespaces too?
                if (string.substring(i,i+1).equals(" ")) {
                    spacesCount++;
                    continue;
                } else

                if (string.substring(i,i+1).matches("[0-9]")) {
                    numbersCount++;
                    continue;
                }

            othersCount++;
        }

        System.out.printf("The string \"%s\" contains %d letters, %d spaces, %d numbers, %d others", string, lettersCount, spacesCount, numbersCount,
                othersCount);

}}
