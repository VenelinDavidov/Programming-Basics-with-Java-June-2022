package ConditionalStatements_Exercise;

import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numOfStatist = Integer.parseInt(scanner.nextLine());
        double priceCloths = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double allPriceCloths = numOfStatist * priceCloths;

        if (numOfStatist > 150) {
            allPriceCloths = allPriceCloths - (allPriceCloths * 0.10);
        }

        double totalSum = allPriceCloths + decor;


        if (totalSum > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard starts filming with %.2f leva left", totalSum - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget -totalSum );
        }
    }
}
