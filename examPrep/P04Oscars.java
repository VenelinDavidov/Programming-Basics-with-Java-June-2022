package examPrep;

import java.util.Scanner;

public class P04Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameAct = scanner.nextLine();
        double pointsAcademy = Double.parseDouble(scanner.nextLine());
        int countJudges = Integer.parseInt(scanner.nextLine());

        double totalPoints = pointsAcademy;
        for (int i = 1; i <= countJudges; i++) {
            String nameJudge = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());

            double currentPints = (nameJudge.length() * judgePoints / 2);

            totalPoints = totalPoints + currentPints;
            if (totalPoints > 1250.5) {
                break;
            }

        }
        if (totalPoints < 1250.5) {
            double diff = 1250.5 - totalPoints;
            System.out.printf("Sorry, %s you need %.1f more!", nameAct, diff);
        } else {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameAct, totalPoints);
        }

    }
}
