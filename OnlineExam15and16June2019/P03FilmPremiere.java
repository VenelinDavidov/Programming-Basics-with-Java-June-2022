package OnlineExam15and16June2019;

import java.util.Scanner;

public class P03FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String film = scanner.nextLine();
        String packageFilm = scanner.nextLine();
        int numTicket = Integer.parseInt(scanner.nextLine());

        double price = 0;


        switch (film) {
            case "John Wick":
                if (packageFilm.equals("Drink")) {
                    price += 12 * numTicket;
                } else if (packageFilm.equals("Popcorn")) {
                    price += 15 * numTicket;
                } else if (packageFilm.equals("Menu")) {
                    price += 19 * numTicket;
                }
                break;
            case "Star Wars":
                if (packageFilm.equals("Drink")) {
                    price += 18 * numTicket;
                } else if (packageFilm.equals("Popcorn")) {
                    price += 25 * numTicket;
                } else if (packageFilm.equals("Menu")) {
                    price += 30 * numTicket;
                }
                if (numTicket >= 4) {
                    price = price * 0.70;
                }
                break;

            case "Jumanji":
                if (packageFilm.equals("Drink")) {
                    price += 9 * numTicket;
                } else if (packageFilm.equals("Popcorn")) {
                    price += 11 * numTicket;
                } else if (packageFilm.equals("Menu")) {
                    price += 14 * numTicket;
                }
                if (numTicket == 2) {
                    price = price * 0.85;
                }
                break;


        }
        System.out.printf("Your bill is %.2f leva.", price);
    }
}
