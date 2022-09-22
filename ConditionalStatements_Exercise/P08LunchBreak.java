package ConditionalStatements_Exercise;

import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tvShowName = scanner.nextLine();
        int showCanTime = Integer.parseInt(scanner.nextLine());
        int breakInMinutes = Integer.parseInt(scanner.nextLine());

        double timeLunch = breakInMinutes / 8.0;
        double timeRelax = breakInMinutes / 4.0;

        double remainingTime = breakInMinutes - timeLunch - timeRelax;

        double diff = Math.abs(remainingTime - showCanTime);

        if (remainingTime >= showCanTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    tvShowName, Math.ceil(diff));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    tvShowName, Math.ceil(diff));
        }
    }
}
