package Exam_6And7July2019;

import java.util.Scanner;

public class P05FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameTeam = scanner.nextLine();
        int gameCount = Integer.parseInt(scanner.nextLine());

        int totalPoints = 0;
        int totalDraws = 0;
        int totalWins = 0;

        for (int i = 0; i < gameCount; i++) {
            String gameType = scanner.nextLine();

            if (gameType.equals("W")) {
                totalPoints = totalPoints + 3;
                totalWins++;

            } else if (gameType.equals("D")) {
                totalPoints = totalPoints + 1;
                totalDraws++;

            }
        }
        if (gameCount == 0) {
            System.out.printf("%s hasn't played any games during this season.", nameTeam);
        } else if (gameCount >= 1) {
            double winRate = totalWins * 1.0 / gameCount * 100;
            System.out.printf("%s has won %d points during this season. %n", nameTeam, totalPoints);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", totalWins);
            System.out.printf("## D: %d%n", totalDraws);
            System.out.printf("## L: %d%n", gameCount - totalWins - totalDraws);
            System.out.printf("Win rate: %.2f%%", winRate);

        }
    }
}
