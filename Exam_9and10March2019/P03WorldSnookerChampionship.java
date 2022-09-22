package Exam_9and10March2019;

import java.util.Scanner;

public class P03WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String stage = scanner.nextLine();
        String typeBillet = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        boolean photoWithTrophy = scanner.nextLine().equals("Y");

        double price = 0;

        switch (stage) {
            case "Quarter final":
                if ("Standard".equals(typeBillet)) {
                    price = 55.50;
                } else if ("Premium".equals(typeBillet)) {
                    price = 105.20;
                } else if ("VIP".equals(typeBillet)) {
                    price = 118.90;
                }
                break;
            case "Semi final":
                if ("Standard".equals(typeBillet)) {
                    price = 75.88;
                } else if ("Premium".equals(typeBillet)) {
                    price = 125.22;
                } else if ("VIP".equals(typeBillet)) {
                    price = 300.40;
                }
                break;
            case "Final":
                if ("Standard".equals(typeBillet)) {
                    price = 110.10;
                } else if ("Premium".equals(typeBillet)) {
                    price = 160.66;
                } else if ("VIP".equals(typeBillet)) {
                    price = 400.00;
                }
                break;
        }

        double priceBullet = quantity * price;

        if (priceBullet > 4000) {
            priceBullet = priceBullet * 0.75;
            photoWithTrophy = false;
        } else if (priceBullet > 2500) {
            priceBullet = priceBullet * 0.90;
        }

        if (photoWithTrophy) {
            priceBullet = priceBullet + (quantity * 40);
        }
        System.out.printf("%.2f", priceBullet);
    }
}
