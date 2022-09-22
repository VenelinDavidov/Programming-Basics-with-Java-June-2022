package Exam_6And7July2019;

import java.util.Scanner;

public class P03TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        String pack = scanner.nextLine();
        String discount = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        boolean isValid = false;


        double price = 0;

        if (days > 7) {
            days--;
        }
        switch (town) {
            case "Bansko":
            case "Borovets":
                if (discount.equals("yes")) {
                    if (pack.equals("noEquipment")) {
                        price = 80 * 0.95;
                    } else if (pack.equals("withEquipment")) {
                        price = 100 * 0.90;
                    }
                    isValid = true;
                    break;
                }

                if (discount.equals("no")) {
                    if (pack.equals("noEquipment")) {
                        price = 80;
                    } else if (pack.equals("withEquipment")) {
                        price = 100;
                    }
                    isValid = true;
                    break;
                }


            case "Varna":
            case "Burgas":
                if (discount.equals("yes")) {
                    if (pack.equals("noBreakfast")) {
                        price = 100 * 0.93;
                    } else if (pack.equals("withBreakfast")) {
                        price = 130 * 0.88;
                    }
                    isValid = true;
                    break;
                }
             if (discount.equals("no")){
                 if (pack.equals("noBreakfast")) {
                     price = 100;
                 } else if (pack.equals("withBreakfast")) {
                     price = 130;
                 }
                 isValid = true;
                 break;
             }
        }


        if (isValid) {
            double totalPrice = days * price;
            System.out.printf("The price is %.2flv! Have a nice time!", totalPrice);
        } else if (!isValid) {
            System.out.println("Invalid input!");
        } else if (days < 1) {
            System.out.println("Days must be positive number!");
        }
    }
}

