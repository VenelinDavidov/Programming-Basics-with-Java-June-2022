package OnlineRegularExam_20And21August2022;

import java.util.Scanner;

public class P06GoodMine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int location = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < location; i++) {
            double avrExtraction = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());

            double sumExtraction = 0;
            for (int j = 0; j < days; j++) {
                double extraction = Double.parseDouble(scanner.nextLine());
                sumExtraction += extraction;
            }
            double averYield = sumExtraction / days;


            if (averYield >= avrExtraction) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averYield);
            } else {
                double diff = Math.abs(avrExtraction - averYield);
                System.out.printf("You need %.2f gold.", diff);
            }

        }
    }
}





