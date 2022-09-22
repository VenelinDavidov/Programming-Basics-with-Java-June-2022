package examPrep;

import java.util.Scanner;

public class P02MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSecOne = Double.parseDouble(scanner.nextLine());

        double georgiTime = distance * timeInSecOne;
        double delay = Math.floor(distance / 50) * 30;
        double totalTime = georgiTime + delay;

        if (totalTime < record){
            System.out.printf(" Yes! The new record is %.2f seconds.",totalTime);
        } else {
            double diff = totalTime - record;
            System.out.printf("No! He was %.2f seconds slower.", diff);
        }

    }
}
