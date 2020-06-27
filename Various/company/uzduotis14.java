package Various.company;

import java.util.Random;

public class uzduotis14 {
        public static void main(String args[]){        int winCount = 0;
            int[] ticket = new int[46];
            int[] winTicket = new int[46];
            Random r = new Random();        for (int i = 0; i<ticket.length; i++){
                ticket[i] = r.nextInt(10);
                winTicket[i] = r.nextInt(10);
                System.out.printf("Jusu skaicius : %d. Bilieto skaicius : %d\n", ticket[i], winTicket[i]);
                if (ticket[i] == winTicket[i]){
                    winCount++;
                }        }        System.out.printf("Atspejote skaiciu: %d\n",winCount);        if (winCount == ticket.length){
                System.out.println("Sveikiname laimejus milijona!");
            }
            if (winCount != 0) {
                switch (winCount) {
                    case 4:
                    case 5:
                    case 6:
                        System.out.println("Laimejote 100$");
                        break;
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        System.out.println("Laimejote 1000$");
                        break;
                }
                if (winCount > 10 && winCount < 20) {
                    System.out.println("Laimejote 1000$");
                } else if (winCount > 20 && winCount < 30) {
                    System.out.println("Laimejote 20 000$");
                } else if (winCount > 30 && winCount < 46) {
                    System.out.println("Laimejote 100 000$");
                }} else
                System.out.println("Bandykite dar karta!");    }
    }

