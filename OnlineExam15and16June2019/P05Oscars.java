package OnlineExam15and16June2019;

import java.util.Scanner;

public class P05Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double pointsAcademy = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        double totalPoints = pointsAcademy;
        for (int i = 1; i <= n; i++) {
            String nameJudge = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());

            double currentPints = (nameJudge.length() * judgePoints / 2);
            totalPoints += currentPints;

            if (totalPoints > 1250.5) {
                break;
            }

        }
        if (totalPoints < 1250.5) {
            double diff = 1250.5 - totalPoints;
            System.out.printf("Sorry, %s you need %.1f more!", name, diff);
        } else {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, totalPoints);
        }
    }
}
