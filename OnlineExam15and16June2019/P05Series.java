package OnlineExam15and16June2019;

import java.util.Scanner;

public class P05Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());

            if (name.equals("Thrones")) {
                price *= 0.50;
            } else if (name.equals("Lucifer")) {
                price *= 0.60;
            } else if (name.equals("Protector")) {
                price *= 0.70;
            } else if (name.equals("TotalDrama")) {
                price *= 0.80;
            } else if (name.equals("Area")) {
                price *= 0.90;
            }
            budget -= price;
        }
        if (budget >= 0) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(budget));
        }
    }
}
