package ForLoop_Exercise;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        double totalPoints = pointsFromAcademy;

        for (int i = 1; i <= n; i++) {
            String judge = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

            int length = judge.length();
            double calculatedPints = length * points / 2;
            totalPoints = totalPoints + calculatedPints;

            if (totalPoints > 1250.5) {
                break;
            }

        }

        if (totalPoints > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5 - totalPoints);
        }

    }
}
