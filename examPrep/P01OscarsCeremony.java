package examPrep;

import java.util.Scanner;

public class P01OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int rent = Integer.parseInt(scanner.nextLine());

        double statutesPrime = rent * 0.7;

        double cateringPrime = statutesPrime * 0.85;

        double soundPrice = cateringPrime / 2;

        double totalPrice = statutesPrime + cateringPrime + soundPrice + rent;

        System.out.printf("%.2f",totalPrice);
    }


}
