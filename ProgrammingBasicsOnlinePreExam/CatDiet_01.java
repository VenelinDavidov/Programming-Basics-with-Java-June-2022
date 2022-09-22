package ProgrammingBasicsOnlinePreExam;

import java.util.Scanner;

public class CatDiet_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int percentFats  = Integer.parseInt(scanner.nextLine());
        int percentProtein  = Integer.parseInt(scanner.nextLine());
        int percentCarbohydrates = Integer.parseInt(scanner.nextLine());
        int  allCalories = Integer.parseInt(scanner.nextLine());
        int percentWater = Integer.parseInt(scanner.nextLine());

        double gramsFats =  (allCalories * percentFats/100.0) / 9;
        double gramsProtein = (allCalories * percentProtein/100.0)/4;
        double gramsCarbon = (allCalories * percentCarbohydrates/100.0) /4;

        double weightFoods = gramsCarbon +gramsFats +gramsProtein;
        double oneGramFood = allCalories / weightFoods;

        double caloriesWater = (100 - percentWater);
        double oneGramCalories = (caloriesWater * oneGramFood) / 100;

        System.out.printf("%.4f",oneGramCalories);

    }
}
