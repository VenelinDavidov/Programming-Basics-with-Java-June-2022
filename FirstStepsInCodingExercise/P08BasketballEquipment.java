package FirstStepsInCodingExercise;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double tax = Double.parseDouble(scanner.nextLine());

       double sneakersPrice = tax - ( tax * 0.40);
       double uniformPrice = sneakersPrice - (sneakersPrice * 0.20);
       double basketBall = uniformPrice /4;
       double accssories = basketBall / 5;

       double  totalPrice =tax+ sneakersPrice + uniformPrice +basketBall +accssories;

        System.out.println(totalPrice);

    }
}
