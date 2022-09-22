package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double priceNylon = (nylon + 2) * 1.50;
        double pricePaint = (paint + paint * 10 * 0.01) * 14.50;
        double priceThinner = thinner * 5;

        double priceMaterials = priceNylon + pricePaint + priceThinner + 0.40;
        double workersPrice = (priceMaterials * 30 * 0.01) * hours;

        double totalSum = workersPrice + priceMaterials;

        System.out.printf("%.2f", totalSum);


    }
}
