package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P09FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int wight = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent =Double.parseDouble(scanner.nextLine());

        int litersInCm = lenght *wight *height;
        double litersInLiters = litersInCm * 0.001;

        double allLiters = litersInLiters - (litersInLiters *percent /100);

        System.out.println(allLiters);

    }
}
