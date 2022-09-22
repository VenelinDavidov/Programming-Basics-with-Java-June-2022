package Exam_9and10March2019;

import java.util.Scanner;

public class P06BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tournament = scanner.nextLine();
        int win = 0;
        int lost = 0;
        int allMatches = 0;



        while (!tournament.equals("End of tournaments")) {


            int matches = Integer.parseInt(scanner.nextLine());
            allMatches += matches;

            for (int i = 1; i <= matches; i++) {
                int myPoints = Integer.parseInt(scanner.nextLine());
                int otherPoints = Integer.parseInt(scanner.nextLine());


                if (myPoints > otherPoints) {
                    win++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, tournament, myPoints - otherPoints);
                } else {
                    lost++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, tournament, Math.abs(myPoints - otherPoints));
                }
            }


            tournament = scanner.nextLine();
        }

        double percentWin = win * 1.0 / allMatches * 100;
        double percentLost = lost * 1.0 / allMatches * 100;
        System.out.printf("%.2f%% matches win%n", percentWin);
        System.out.printf("%.2f%% matches lost%n", percentLost);

    }
}
