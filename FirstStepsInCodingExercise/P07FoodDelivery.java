package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chikenMenu =Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());

        double priceForChiken = chikenMenu * 10.35;
        double priceForFish = fishMenu * 12.40;
        double priceForVegan = veganMenu * 8.15;

        double priceForAllMenu = priceForChiken + priceForFish + priceForVegan;
        double priceDesert= priceForAllMenu * 20 * 0.01;

        double totalPrice = priceForAllMenu + priceDesert + 2.50;

        System.out.printf("%.2f",totalPrice);


    }
}
