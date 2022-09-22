package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit=  Double.parseDouble(scanner.nextLine());
        int mount =Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double totalSum=0;
        totalSum= deposit + mount * ((deposit * percent/100)/12);

        System.out.println(totalSum);

    }
}
