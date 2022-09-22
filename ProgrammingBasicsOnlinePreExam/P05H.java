package ProgrammingBasicsOnlinePreExam;

import java.util.Scanner;

public class P05H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                double budget = Double.parseDouble(scanner.nextLine());
                String input = scanner.nextLine();
                double productsCost = 0;
                int productsBought = 0;
                int productsCount = 0;

                while (!input.equals("Stop")) {
                    double price = Double.parseDouble(scanner.nextLine());
                    productsCount++;

                    if (productsCount % 3 == 0) {
                        price *= 0.5;
                    }
                    productsBought++;
                    productsCost += price;
                    budget -= price;

                    if (budget < price){
                        System.out.println("You don't have enough money!");
                        System.out.printf("You need %.2f leva!", price - budget);
                        return;
                    }

                    input = scanner.nextLine();
                }
                System.out.printf("You bought %d products for %.2f leva.", productsBought, productsCost);
            }
        }


