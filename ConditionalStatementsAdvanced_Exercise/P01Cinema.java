package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int colums = Integer.parseInt(scanner.nextLine());

        double income = 0;
        if ("Premiere".equals(projection)) {
            income = rows * colums * 12;

        } else if ("Normal".equals(projection)){
            income = rows * colums * 7.50;
        } else if ("Discount".equals(projection)){
            income = rows * colums * 5;
        }
        System.out.printf("%.2f leva", income);
    }
}
