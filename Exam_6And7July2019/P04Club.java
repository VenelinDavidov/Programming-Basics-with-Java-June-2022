package Exam_6And7July2019;

import java.io.PrintStream;
import java.util.Scanner;

public class P04Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double profit = Integer.parseInt(scanner.nextLine());
        String cocktail = scanner.nextLine();

        double income = 0;


        while (!cocktail.equals("Party!")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            int price = quantity * cocktail.length();
            double totalPrice = price;

            if (price % 2 != 0) {
                totalPrice = price * 0.75;
            }
            income += totalPrice;
            profit = profit - totalPrice;

            if (profit <= 0) {
                break;
            }

            cocktail = scanner.nextLine();
        }
        if (cocktail.equals("Party!")) {
            System.out.printf(" We need %.2f leva more.%n", profit);
            System.out.printf("Club income - %.2f leva.", income);
        } else {
            System.out.println("Target acquired.");
            {
            }
            System.out.printf("Club income - %.2f leva.", income);

        }
    }
}
