package Exam_9and10March2019;

import java.util.Scanner;

public class P05TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int countW = 0;
        int countF = 0;
        int countSF = 0;

        int totalPoints = 0;
        for (int i = 0; i < tournaments; i++) {
            String type = scanner.nextLine();

            if (type.equals("W")) {
                startPoints = startPoints + 2000;
                totalPoints = totalPoints + 2000;
                countW++;
            } else if (type.equals("F")) {
                startPoints = startPoints + 1200;
                totalPoints = totalPoints + 1200;
                countF++;
            } else if (type.equals("SF")) {
                startPoints = startPoints + 720;
                totalPoints = totalPoints + 720;
                countSF++;
            }
        }
        System.out.println("Final points: " + startPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(totalPoints * 1.0 / tournaments));
        System.out.printf("%.2f%%", countW * 1.0 / tournaments * 100);

    }
}
