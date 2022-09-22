package ForLoop_Exercise;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;
        int musala = 0;
        int monblan = 0;
        int kalimanjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <= n; i++) {
            int peopleNum = Integer.parseInt(scanner.nextLine());
            totalSum = totalSum + peopleNum;


            if (peopleNum <= 5) {
                musala = musala + peopleNum;
            } else if (peopleNum <= 12) {
                monblan = monblan + peopleNum;
            } else if (peopleNum <= 25) {
                kalimanjaro = kalimanjaro + peopleNum;
            } else if (peopleNum <= 40) {
                k2 = k2 + peopleNum;
            } else {
                everest = everest + peopleNum;
            }
        }
        System.out.printf("%.2f%%%n", musala * 1.0 / totalSum *100);
        System.out.printf("%.2f%%%n", monblan * 1.0 / totalSum *100);
        System.out.printf("%.2f%%%n", kalimanjaro * 1.0 / totalSum *100);
        System.out.printf("%.2f%%%n", k2 * 1.0 / totalSum *100);
        System.out.printf("%.2f%%%n", everest * 1.0 / totalSum *100);
    }
}
