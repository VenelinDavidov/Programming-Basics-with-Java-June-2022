package Exam_6And7July2019;

import java.util.Scanner;

public class P04Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        int total = height *width *4;
        double toPaint = Math.ceil(total  - (total * percent * 1.0 /100));

        String command = scanner.nextLine();
        while (!command.equals("Tired!")) {
            int liters = Integer.parseInt(command);

            toPaint = toPaint - liters;
            if (toPaint <= 0){
                break;
            }

            command = scanner.nextLine();

        }
        if (toPaint == 0){
            System.out.println("All walls are painted! Great job, Pesho!" );
        }else if ( toPaint > 0){
            System.out.printf("%.0f quadratic m left.",toPaint);
        } else {
            System.out.printf("All walls are painted and you have %.0f l paint left!",Math.abs(toPaint));
        }

    }
}
