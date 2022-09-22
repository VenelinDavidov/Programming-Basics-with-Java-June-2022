package Exam_9and10March2019;

import java.util.Scanner;

public class P01TennisEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double racket = Double.parseDouble(scanner.nextLine());
        int numRacket = Integer.parseInt(scanner.nextLine());
        int snickers = Integer.parseInt(scanner.nextLine());


        double priceRacket = racket * numRacket;
        double priceSnickers = racket / 6;
        double priceAllSnickers = snickers * priceSnickers;
        double equipment = (priceRacket + priceAllSnickers) * 0.20;
        double totalPrice = priceRacket + priceAllSnickers + equipment;
        double priceDjokovikc = totalPrice / 8;
        double priceAllSponsor = totalPrice * 7 / 8;

        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(priceDjokovikc));
        System.out.printf("Price to be paid by sponsors %.0f",Math.ceil(priceAllSponsor));
    }
}
