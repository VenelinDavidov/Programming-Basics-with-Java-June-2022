package examPrep;

import java.util.Scanner;

public class P06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firsNum = scanner.nextLine();
        String secondNum = scanner.nextLine();


        for (int i = firsNum.charAt(0); i <= secondNum.charAt(0); i++) {
            for (int j = firsNum.charAt(1); j <= secondNum.charAt(1); j++) {
                for (int k = firsNum.charAt(2); k <= secondNum.charAt(2); k++) {
                    for (int l = firsNum.charAt(3); l <= secondNum.charAt(3); l++) {


                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%c%c%c%c ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
