package WhileLoopExercise;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());

        double sumInCoins = Math.round(sum * 100);

        int countCoins = 0;

        while (sumInCoins > 0) {

            if (sumInCoins >= 200) {
               countCoins++;
               sumInCoins = sumInCoins -200;
            } else if (sumInCoins >= 100) {
                countCoins++;
                sumInCoins = sumInCoins -100;
            } else if (sumInCoins >= 50) {
                countCoins++;
                sumInCoins = sumInCoins - 50;
            } else if (sumInCoins >= 20) {
                countCoins++;
                sumInCoins = sumInCoins - 20;
            } else if (sumInCoins >= 10) {
                countCoins++;
                sumInCoins = sumInCoins - 10;
            } else if (sumInCoins >= 5) {
                countCoins++;
                sumInCoins = sumInCoins - 5;
            } else if (sumInCoins >= 2) {
                countCoins++;
                sumInCoins = sumInCoins - 2;
            } else if (sumInCoins >= 1) {
                countCoins++;
                sumInCoins = sumInCoins - 1;
            }else {
                break;
            }
        }
        System.out.println(countCoins);

    }
}
