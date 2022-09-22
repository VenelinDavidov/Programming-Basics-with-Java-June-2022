package ConditionalStatements_Exercise;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double priceOfExcursion = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int talkingDolls = Integer.parseInt(scanner.nextLine());
        int bear = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());


        double sum = puzzle * 2.60 + talkingDolls * 3 + bear * 4.10 + minions * 8.20 + truck * 2;

        double numOfToys = puzzle + talkingDolls + bear + minions + truck;

        if (numOfToys >= 50) {
            sum = sum - (sum * 0.25);
        }

        double profit = sum - (sum * 0.10);

        if (profit > priceOfExcursion) {
            System.out.printf("Yes! %.2f lv left.", profit - priceOfExcursion);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", priceOfExcursion - profit);
        }

    }
}
