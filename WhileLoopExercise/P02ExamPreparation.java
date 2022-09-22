package WhileLoopExercise;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxBadGrades = Integer.parseInt(scanner.nextLine());

        double totalGrade = 0;
        int countAllProblem = 0;
        int countBadGrades =0;
        boolean needBreak = false;
        String lastProblem = "";

        String command = scanner.nextLine();
        while (!command.equals("Enough")){
           String currentProblem = command;
           double grade =  Double.parseDouble(scanner.nextLine());
           countAllProblem ++;
           lastProblem = currentProblem;

           if (grade <= 4){
               countBadGrades++;

           }

           totalGrade =totalGrade + grade;

           if (countBadGrades >= maxBadGrades){
               needBreak =true;
               break;
           }


            command = scanner.nextLine();
        }

        if (needBreak ){
            System.out.printf("You need a break, %d poor grades.",countBadGrades);
        } else {
            System.out.printf("Average score:%.2f%n", totalGrade / countAllProblem);
            System.out.printf("Number of problems: %d%n", countAllProblem);
            System.out.printf("Last problem: %s", lastProblem);
        }

    }
}
