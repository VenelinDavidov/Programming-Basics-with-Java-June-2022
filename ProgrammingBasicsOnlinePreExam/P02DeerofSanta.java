package ProgrammingBasicsOnlinePreExam;

import java.util.Scanner;

public class P02DeerofSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysAway = Integer.parseInt(scanner.nextLine());
        int foodsInKilograms = Integer.parseInt(scanner.nextLine());
        double firstDeerFood = Double.parseDouble(scanner.nextLine());
        double secondDeerFood =  Double.parseDouble(scanner.nextLine());
        double thirdDeerFood = Double.parseDouble(scanner.nextLine());

        double firsDeer = daysAway * firstDeerFood;
        double secondDeer = daysAway * secondDeerFood;
        double thirdDeer = daysAway * thirdDeerFood;


        double allNeedFood =firsDeer + secondDeer + thirdDeer;


        if (foodsInKilograms > allNeedFood){

            System.out.printf("%.0f kilos of food left.", Math.floor(foodsInKilograms - allNeedFood));
        } else {
            double diff = Math.ceil(allNeedFood - foodsInKilograms);
            System.out.printf("%.0f more kilos of food are needed.", diff);

        }
    }
}
