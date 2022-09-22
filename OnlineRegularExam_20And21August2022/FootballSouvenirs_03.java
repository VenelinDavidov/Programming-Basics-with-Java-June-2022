package OnlineRegularExam_20And21August2022;

import java.util.Scanner;

public class FootballSouvenirs_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        String souvenirType = scanner.nextLine();
        double amountPurchased = Integer.parseInt(scanner.nextLine());

        double totalprice = 0;

        if (team.equals("Argentina")&& souvenirType.equals("flags")){
            totalprice = amountPurchased * 3.25;
            System.out.printf("Pepi bought %.0f %s of %s for %.2f lv.", amountPurchased,souvenirType,team, totalprice );
        } else if (team.equals("Argentina")&& souvenirType.equals("caps")) {
            totalprice = amountPurchased * 7.20;
            System.out.printf("Pepi bought %.0f %s of %s for %.2f lv.", amountPurchased,souvenirType,team, totalprice );
        }else if (team.equals("Argentina")&& souvenirType.equals("posters")) {
            totalprice = amountPurchased * 5.10;
            System.out.printf("Pepi bought %.0f %s of %s for %.2f lv.", amountPurchased,souvenirType,team, totalprice );
        }else if (team.equals("Argentina")&& souvenirType.equals("stickers")) {
            totalprice = amountPurchased * 1.25;
            System.out.printf("Pepi bought %.0f %s of %s for %.2f lv.", amountPurchased,souvenirType,team, totalprice );
        }else if (team.equals("Brazil")&& souvenirType.equals("flags")) {
            totalprice = amountPurchased * 4.20;
            System.out.printf("Pepi bought %.0f %s of %s for %.2f lv.", amountPurchased,souvenirType,team, totalprice );
        }else if (team.equals("Brazil")&& souvenirType.equals("caps")) {
            totalprice = amountPurchased * 8.50;
            System.out.printf("Pepi bought %.0f %s of %s for %.2f lv.", amountPurchased,souvenirType,team, totalprice );
        }else if (team.equals("Brazil")&& souvenirType.equals("posters")) {
            totalprice = amountPurchased * 5.35;
            System.out.printf("Pepi bought %.0f %s of %s for %.2f lv.", amountPurchased,souvenirType,team, totalprice );
        }else if (team.equals("Brazil")&& souvenirType.equals("stickers")) {
            totalprice = amountPurchased * 1.20;
            System.out.printf("Pepi bought %.0f %s of %s for %.2f lv.", amountPurchased,souvenirType,team, totalprice );
        }else if (team.equals("Croatia")&& souvenirType.equals("flags")) {
            totalprice = amountPurchased * 2.75;
            System.out.printf("Pepi bought %.0f %s of %s for %.2f lv.", amountPurchased,souvenirType,team, totalprice );
        }else if (team.equals("Croatia")&& souvenirType.equals("caps")) {
            totalprice = amountPurchased * 6.90;
            System.out.printf("Pepi bought %.0f %s of %s for %.2f lv.", amountPurchased,souvenirType,team, totalprice );
        }else if (team.equals("Croatia")&& souvenirType.equals("posters")) {
            totalprice = amountPurchased * 4.95;
            System.out.printf("Pepi bought %.0f %s of %s for %.2f lv.", amountPurchased,souvenirType,team, totalprice );
        }else if (team.equals("Croatia")&& souvenirType.equals("stickers")) {
            totalprice = amountPurchased * 1.10;
            System.out.printf("Pepi bought %.0f %s of %s for %.2f lv.", amountPurchased,souvenirType,team, totalprice );
        }else if (team.equals("Denmark")&& souvenirType.equals("flags")) {
            totalprice = amountPurchased * 3.10;
            System.out.printf("Pepi bought %.0f %s of %s for %.2f lv.", amountPurchased,souvenirType,team, totalprice );
        }else if (team.equals("Denmark")&& souvenirType.equals("caps")) {
            totalprice = amountPurchased * 6.50;
            System.out.printf("Pepi bought %.0f %s of %s for %.2f lv.", amountPurchased,souvenirType,team, totalprice );
        }else if (team.equals("Denmark")&& souvenirType.equals("posters")) {
            totalprice = amountPurchased * 4.80;
            System.out.printf("Pepi bought %.0f %s of %s for %.2f lv.", amountPurchased,souvenirType,team, totalprice );
        }else if (team.equals("Denmark")&& souvenirType.equals("stickers")) {
            totalprice = amountPurchased * 0.90;
            System.out.printf("Pepi bought %.0f %s of %s for %.2f lv.", amountPurchased,souvenirType,team, totalprice );
        } else if(!team.equals("Argentina") &&!team.equals("Brazil")&&!team.equals("Croatia")&&!team.equals("Denmark")) {
            System.out.println("Invalid country!");
        }else if(!souvenirType.equals("flags")&& !souvenirType.equals("caps")&& !souvenirType.equals("posters")&&!souvenirType.equals("stickers")){
            System.out.println("Invalid stock!");
        }

    }
}


