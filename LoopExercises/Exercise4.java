package LoopExercises;

public class Exercise4 {
    public static void main(String[] args) {
        int threshold = 100;
        Integer[] divisibleByThree = new Integer[threshold];
        Integer[] divisibleByFive = new Integer[threshold];
        Integer[] divisibleByFifteen = new Integer[threshold];

        int threeCounter = 0;
        int fiveCounter = 0;
        int fifteenCounter = 0;

        for (int i = 1; i < threshold; i++) {
            if (i % 3 == 0) {
                divisibleByThree[threeCounter] = i;
                threeCounter++;
            }
            if (i % 5 == 0) {
                divisibleByFive[fiveCounter] = i;
                fiveCounter++;
            }
            if (i % 15 == 0) {
                divisibleByFifteen[fifteenCounter] = i;
                fifteenCounter++;
            }
        }

        System.out.print("Divisible by 3 - ");
        for(int i=0; i< threeCounter; i++) {
            System.out.print(divisibleByThree[i] + " ");
        }

        System.out.print("\nDivisible by 5 - ");
        for(int i=0; i< fiveCounter; i++) {
            System.out.print(divisibleByFive[i] + " ");
        }

        System.out.print("\nDivisible by 3 & 5 - ");
        for(int i=0; i< fifteenCounter; i++) {
            System.out.print(divisibleByFifteen[i] + " ");
    }

}}
