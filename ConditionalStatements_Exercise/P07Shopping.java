package ConditionalStatements_Exercise;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget =  Double.parseDouble(scanner.nextLine());
        int card = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ram=Integer.parseInt(scanner.nextLine());

        double discaunt = 0;
        double resul = 0;
        double finish = 0;
        double total = 0;

        double sumCard = card * 250;
        double sumProcessor = sumCard * 0.35;
        double sumRam = sumCard * 0.10;

        double sum = sumCard + (sumProcessor * processor) + (sumRam * ram);

        if ( card > processor){
            sum = sum * 0.85;

        }
        if (budget >= sum){
            System.out.printf("You have %.2f leva left!", budget-sum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", sum- budget);
        }
    }
}