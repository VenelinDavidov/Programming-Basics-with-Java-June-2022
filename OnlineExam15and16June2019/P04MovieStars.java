package OnlineExam15and16June2019;

import java.util.Scanner;

public class P04MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();

        while (!name.equals("ACTION")) {
            if (name.length() > 15) {
                budget -= budget * 0.2;
            } else {
                double salary =  Double.parseDouble(scanner.nextLine());
                budget -= salary;
            }

            if (budget < 0) {
                break;
            }

            name = scanner.nextLine();
        }
        if (name.equals("ACTION")) {
            System.out.printf("We are left with %.2f leva.", budget);
        } else {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        }
    }
}
