package ProgrammingBasicsOnlinePreExam;

import java.util.Scanner;

public class P04Workou_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        double m = Double.parseDouble(scanner.nextLine());

        double allKilometres = m;
        for (int i = 0; i < n; i++) {
            double nextDay = Double.parseDouble(scanner.nextLine());
            m = m + m * (nextDay / 100);
            allKilometres += m;
        }
        if (allKilometres >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(allKilometres - 1000));

        } else {
            double diff = Math.ceil(1000 - allKilometres);
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", diff);
        }

    }
}
