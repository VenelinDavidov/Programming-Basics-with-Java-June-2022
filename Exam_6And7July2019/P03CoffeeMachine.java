package Exam_6And7July2019;

import java.util.Scanner;

public class P03CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String drinks = scanner.nextLine();
        String sugar = scanner.nextLine();
        int numDrinks = Integer.parseInt(scanner.nextLine());


        double price = 0;

        if (drinks.equals("Espresso")) {
            if (sugar.equals("Without")) {
                price = price + 0.90 * numDrinks;
                price = price * 0.65;

            } else if (sugar.equals("Normal")) {
                price = price + 1.00 * numDrinks;

            } else if (sugar.equals("Extra")) {
                price = price + 1.20 * numDrinks;
            }
            if (numDrinks >= 5) {
                price = price * 0.75;
            }

        } else if (drinks.equals("Cappuccino")) {
            if (sugar.equals("Without")) {
                price = price + 1.00 * numDrinks;
                price = price * 0.65;

            } else if (sugar.equals("Normal")) {
                price = price + 1.20 * numDrinks;

            } else if (sugar.equals("Extra")) {
                price = price + 1.60 * numDrinks;
            }

        } else if (drinks.equals("Tea")) {
            if (sugar.equals("Without")) {
                price = price + 0.50 * numDrinks;
                price = price * 0.65;

            } else if (sugar.equals("Normal")) {
                price = price + 0.60 * numDrinks;

            } else if (sugar.equals("Extra")) {
                price = price + 0.70 * numDrinks;
            }
        }

        if (price > 15) {
            price = price - (price * 0.20);
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", numDrinks, drinks, price);

    }
}
