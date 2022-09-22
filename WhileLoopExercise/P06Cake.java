package WhileLoopExercise;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int cakePieces = width * lenght;

        String command = scanner.nextLine();
        boolean noMoreCake = false;
        while (!command.equals("STOP")) {
            int pieces = Integer.parseInt(command);
            cakePieces =cakePieces -pieces;

            if (cakePieces <=0){
                noMoreCake = true;
                break;
            }

            command = scanner.nextLine();
        }
        if (noMoreCake){
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(cakePieces));
        }else {
            System.out.printf("%d pieces are left.",cakePieces);
        }


    }
}
