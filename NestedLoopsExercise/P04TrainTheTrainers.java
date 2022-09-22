package NestedLoopsExercise;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double allGradesSum = 0;
        int countAllGradesSum= 0;

        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            String presentation = command;

            double sumCurrentGrades = 0;
            for (int i = 1; i <= n; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                countAllGradesSum++;
                sumCurrentGrades += currentGrade;

            }
            allGradesSum = allGradesSum + sumCurrentGrades;
            double avgCurrentGreade = sumCurrentGrades / n;

            System.out.printf("%s - %.2f.%n", presentation, avgCurrentGreade);


            command = scanner.nextLine();
        }

        double finalGrades = allGradesSum / countAllGradesSum;
        System.out.printf("Student's final assessment is %.2f.",finalGrades);

    }
}
