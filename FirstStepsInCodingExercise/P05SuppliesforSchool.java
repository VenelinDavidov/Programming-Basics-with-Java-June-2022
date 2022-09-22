package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P05SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pans =Integer.parseInt(scanner.nextLine());
        int marker = Integer.parseInt(scanner.nextLine());
        int litersPer = Integer.parseInt(scanner.nextLine());
        int parsentDiscount = Integer.parseInt(scanner.nextLine());

        double priceBeforeDiscount = pans *5.80+marker*7.20+litersPer*1.20;
        double totalPrice = priceBeforeDiscount - (priceBeforeDiscount * parsentDiscount/100);

        System.out.printf("%.2f",totalPrice);


    }
}
