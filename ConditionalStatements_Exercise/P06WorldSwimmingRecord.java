package ConditionalStatements_Exercise;

import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSec = Double.parseDouble(scanner.nextLine());

        double result = distance * timeInSec;
        double slowDown = Math.floor(distance / 15);
        double resistance = slowDown * 12.5;

        double finalTime = result + resistance;

        if (finalTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",finalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(record-finalTime));
        }


    }
}
