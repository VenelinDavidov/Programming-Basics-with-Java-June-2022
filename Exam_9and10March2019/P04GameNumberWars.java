package Exam_9and10March2019;

import java.util.Scanner;

public class P04GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player1 = scanner.nextLine();
        String player2 = scanner.nextLine();

        int win1 = 0;
        int win2 = 0;

        String card1 = scanner.nextLine();

        while (!card1.equals("End of game")) {
            String card2 = scanner.nextLine();
            int points1 = Integer.parseInt(card1);
            int points2 = Integer.parseInt(card2);

            if (points1 > points2) {
                win1 = win1 + (points1 - points2);
            } else if (points1 < points2) {
                win2 = win2 + (points2 - points1);
            } else {
                System.out.println("Number wars!");
                int lastCard1 = Integer.parseInt(scanner.nextLine());
                int lastCard2 = Integer.parseInt(scanner.nextLine());

                if (lastCard1 > lastCard2) {
                    System.out.printf("%s is winner with %d points", player1, win1);
                    break;
                } else if (lastCard2 > lastCard1) {
                    System.out.printf("%s is winner with %d points", player2, win2);
                    break;
                }
            }
            card1 = scanner.nextLine();
        }
        if (card1.equals("End of game")){
            System.out.printf("%s has %d points%n", player1, win1);
            System.out.printf("%s has %d points%n", player2, win2);
        }
    }
}
