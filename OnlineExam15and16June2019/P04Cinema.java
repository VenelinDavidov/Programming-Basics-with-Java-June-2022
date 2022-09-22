package OnlineExam15and16June2019;

import java.util.Scanner;

public class P04Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seats = Integer.parseInt(scanner.nextLine());
        int profit = 0;

        String command = scanner.nextLine();
        while (!command.equals("Movie time!")) {
            int people = Integer.parseInt(command);

            if (seats - people >= 0) {
                seats -= people;
                profit += people * 5;
                if (people % 3 == 0) {
                    profit -= 5;
                }
            } else {
                System.out.println("The cinema is full.");
                break;
            }
            command = scanner.nextLine();
        }
        if ("Movie time!".equals(command)) {
            System.out.println(String.format("There are %d seats left in the cinema.", seats));
        }
        System.out.printf("Cinema income - %d lv.", profit);
    }
}
