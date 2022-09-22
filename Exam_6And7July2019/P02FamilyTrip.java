package Exam_6And7July2019;

import java.util.Scanner;

public class P02FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nightCnt = Integer.parseInt(scanner.nextLine());
        double nightPrice = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        if (nightCnt > 7) {
            nightPrice = nightPrice * 0.95;
        }

        double totalNightPrice = nightCnt * nightPrice;
        double additionalCosts = budget * (percent / 100.0);

        double totalPrice = totalNightPrice + additionalCosts;
        if (totalPrice > budget) {
            double moneyNeed = totalPrice - budget;
            System.out.printf("%.2f leva needed.", moneyNeed);
        } else {
            double moneyLeft = budget - totalPrice;
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", moneyLeft);
        }
    }
}
