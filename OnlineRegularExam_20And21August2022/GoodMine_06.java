package OnlineRegularExam_20And21August2022;

import java.util.Scanner;

public class GoodMine_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int locations = Integer.parseInt(scanner.nextLine());



        for (int i = 1; i <= locations; i++) {
            double expectedGoldPerDay = Double.parseDouble(scanner.nextLine());
            int daysGathering = Integer.parseInt(scanner.nextLine());
            double goldPerLocation = 0;
            double avrgGoldPerDay = 0;

            for (int j = 1; j <= daysGathering; j++) {
                double gatheredGold = Double.parseDouble(scanner.nextLine());
                goldPerLocation += gatheredGold;
                avrgGoldPerDay = goldPerLocation / daysGathering;


            }

            if (expectedGoldPerDay <= avrgGoldPerDay) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", avrgGoldPerDay);
            } else {
                System.out.printf("You need %.2f gold.%n", expectedGoldPerDay - avrgGoldPerDay);
            }
        }


    }
}



