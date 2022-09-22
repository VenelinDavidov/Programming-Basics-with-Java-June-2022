package Exam_9and10March2019;

import java.util.Scanner;

public class P04Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double pointsStart = 301;
        int successfulShots = 0;
        int unSuccessfulShots = 0;


        while (pointsStart != 0) {
            String area = scanner.nextLine();

            if (area.equals("Retire")) {
                break;
            }
            int points = Integer.parseInt(scanner.nextLine());

            if ("Double".equals(area)) {
                points *= 2;
            } else if ("Triple".equals(area)) {
                points *= 3;
            } else if ("Single".equals(area)){
                points *= 1;
            }

            if (pointsStart - points >= 0) {
                pointsStart = pointsStart - points;
                successfulShots++;
            } else {
                unSuccessfulShots++;
            }


        }
        if (pointsStart == 0) {
            System.out.printf("%s won the leg with %d shots.", name, successfulShots);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", name, unSuccessfulShots);
        }

    }
}
