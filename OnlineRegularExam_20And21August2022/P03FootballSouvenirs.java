package OnlineRegularExam_20And21August2022;

import sun.font.DelegatingShape;

import javax.xml.bind.Element;
import java.util.Scanner;

public class P03FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String team = scanner.nextLine();
        String typeSouvenir = scanner.nextLine();
        int countsSouvenir = Integer.parseInt(scanner.nextLine());

        double price = 0;


        if (team.equals("Argentina")) {
            if (typeSouvenir.equals("flags")) {
                price = countsSouvenir * 3.25;

            } else if (typeSouvenir.equals("caps")) {
                price = countsSouvenir * 7.20;


            } else if (typeSouvenir.equals("posters")) {
                price = countsSouvenir * 5.10;

            } else if (typeSouvenir.equals("stickers")) {
                price = countsSouvenir * 1.25;

            }
        } else if (team.equals("Brazil")) {
            if (typeSouvenir.equals("flags")) {
                price = countsSouvenir * 4.20;

            } else if (typeSouvenir.equals("caps")) {
                price = countsSouvenir * 8.50;
            } else if (typeSouvenir.equals("posters")) {
                price = countsSouvenir * 5.35;

            } else if (typeSouvenir.equals("stickers")) {
                price = countsSouvenir * 1.20;
            }

        } else if (team.equals("Croatia")) {
            if (typeSouvenir.equals("flags")) {
                price = countsSouvenir * 2.75;

            } else if (typeSouvenir.equals("caps")) {
                price = countsSouvenir * 6.90;

            } else if (typeSouvenir.equals("posters")) {
                price = countsSouvenir * 4.95;

            } else if (typeSouvenir.equals("stickers")) {
                price = countsSouvenir * 1.10;

            }

        } else if (team.equals("Denmark")) {
            if (typeSouvenir.equals("flags")) {
                price = countsSouvenir * 3.10;

            } else if (typeSouvenir.equals("caps")) {
                price = countsSouvenir * 6.50;

            } else if (typeSouvenir.equals("posters")) {
                price = countsSouvenir * 4.80;

            } else if (typeSouvenir.equals("stickers")) {
                price = countsSouvenir * 0.90;

            }
        } else if (!team.equals("Argentina") && !team.equals("Brazil") && !team.equals("Croatia") && !team.equals("Denmark")) {
            System.out.println("Invalid country!");
        } else if(!typeSouvenir.equals("flags")&& !typeSouvenir.equals("caps")&& !typeSouvenir.equals("posters")&&!typeSouvenir.equals("stickers")){
            System.out.println("Invalid stock!");
        }

    }

}



