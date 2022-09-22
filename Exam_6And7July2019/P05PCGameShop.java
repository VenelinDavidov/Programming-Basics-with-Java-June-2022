package Exam_6And7July2019;

import java.util.Scanner;

public class P05PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int Hearthstone = 0;
        int Fornite = 0;
        int Overwatch = 0;
        int Others = 0;

        for (int i = 0; i < n; i++) {
            String nameGame = scanner.nextLine();

            switch (nameGame) {
                case "Hearthstone":
                    Hearthstone++;
                    break;
                case "Fornite":
                    Fornite++;
                    break;
                case "Overwatch":
                    Overwatch++;
                    break;
                default:
                    Others++;
                    break;
            }

        }
        System.out.printf("Hearthstone - %.2f%%%n", Hearthstone * 1.0 / n * 100);
        System.out.printf("Fornite - %.2f%%%n", Fornite * 1.0 / n * 100);
        System.out.printf("Overwatch - %.2f%%%n", Overwatch * 1.0 / n * 100);
        System.out.printf("Others - %.2f%%%n", Others * 1.0 / n * 100);
    }
}
