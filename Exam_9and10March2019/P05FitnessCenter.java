package Exam_9and10March2019;

import com.sun.javafx.binding.StringFormatter;

import java.util.Scanner;

public class P05FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int visitors = Integer.parseInt(scanner.nextLine());
        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int proteinShake = 0;
        int proteinBar = 0;
        int training = 0;
        int shopping = 0;

        String activity = scanner.nextLine();
        for (int i = 0; i < visitors; i++) {

            if (activity.equals("Back")) {
                back++;
                training++;
            } else if (activity.equals("Chest")) {
                chest++;
                training++;
            } else if (activity.equals("Legs")) {
                legs++;
                training++;
            } else if (activity.equals("Abs")) {
                abs++;
                training++;
            } else if (activity.equals("Protein shake")) {
                proteinShake++;
                shopping++;
            } else if (activity.equals("Protein bar")) {
                proteinBar++;
                shopping++;
            }
           activity =scanner.nextLine();
        }
        System.out.printf("%d - back%n", back);
        System.out.printf("%d - chest%n", chest);
        System.out.printf("%d - legs%n", legs);
        System.out.printf("%d - abs%n", abs);
        System.out.printf("%d - protein shake%n", proteinShake);
        System.out.printf("%d - protein bar%n", proteinBar);
        System.out.printf("%.2f%% - work out%n", (training * 1.0 / visitors) * 100);
        System.out.printf("%.2f%% - protein", (shopping * 1.0 / visitors) * 100);
    }
}
