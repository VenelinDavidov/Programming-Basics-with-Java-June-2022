package ProgrammingBasicsOnlinePreExam;

import java.util.Scanner;

public class P01CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fats = Integer.parseInt(scanner.nextLine());
        int protein = Integer.parseInt(scanner.nextLine());
        int carbohydrates = Integer.parseInt(scanner.nextLine());
        int allCalories = Integer.parseInt(scanner.nextLine());
        int percentWater = Integer.parseInt(scanner.nextLine());

        double allGramFats = (allCalories * fats / 100.0) / 9;
        double allGramProtein = (allCalories * protein / 100.0) / 4;
        double allGramCarbohydrates = (allCalories * carbohydrates / 100.0) / 4;

        double weightOfFood = allGramFats + allGramProtein + allGramCarbohydrates;
        double caloriesOfGram = allCalories / weightOfFood;
        double caloriesWater = (100 - percentWater);
        double oneGramCalories = (caloriesWater * caloriesOfGram) / 100;

        System.out.printf("%.4f",oneGramCalories);

    }

}
