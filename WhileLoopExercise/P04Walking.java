package WhileLoopExercise;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int totalSteps=0;
        boolean goingHone = false;

        while (totalSteps < 10000){
           String input = scanner.nextLine();

           if (input.equals("Going home")){
               goingHone =true;
               int steps =Integer.parseInt(scanner.nextLine());
               totalSteps = totalSteps + steps;
               break;
            } else {
                int steps =Integer.parseInt(input);
                totalSteps = totalSteps + steps;
           }

        }
        if (goingHone && totalSteps < 10000){
            System.out.printf("%d more steps to reach goal.",10000 - totalSteps);
        } else {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", totalSteps -10000);
        }

    }
}
