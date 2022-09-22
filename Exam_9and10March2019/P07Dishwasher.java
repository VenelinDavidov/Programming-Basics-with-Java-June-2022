package Exam_9and10March2019;

import java.util.Scanner;

public class P07Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = Integer.parseInt(scanner.nextLine());

        int totalsum = 0;
        int cashSum = 0;
        int cardSum = 0;
        int countTotal = 0;
        int countCash = 0;
        int countCard = 0;
        boolean isValid = false;

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            countTotal++;
            int currentAmount = Integer.parseInt(input);


            if (countTotal % 2 != 0) {
                if (currentAmount <= 100) {
                    countCash++;
                    cashSum += currentAmount;
                    totalsum += currentAmount;
                    System.out.println("Product sold!");
                } else {
                    System.out.println("Error in transaction!");
                }

            } else {
                if (currentAmount >= 10) {
                    countCard++;
                    cardSum += currentAmount;
                    totalsum += currentAmount;
                    System.out.println("Product sold!");
                } else {
                    System.out.println("Error in transaction!");
                }
            }

            if (totalsum >= target) {
                isValid = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (isValid) {
            double averageCash = cashSum * 1.0 / countCash;
            double averageCard = cardSum * 1.0 / countCard;
            System.out.printf("Average CS: %.2f%n", averageCash);
            System.out.printf("Average CC: %.2f%n", averageCard);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
