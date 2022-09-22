package Exam_9and10March2019;

import java.util.Scanner;

public class P02FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result1 = scanner.nextLine();
        String result2 = scanner.nextLine();
        String result3 = scanner.nextLine();

        int win = 0;
        int drawn = 0;
        int losses = 0;

        int firstResul1 = result1.charAt(0);
        int secondResul1 = result1.charAt(2);

        if(firstResul1 > secondResul1){
            win++;
        }else if(firstResul1 == secondResul1){
            drawn++;
        }else {
            losses++;
        }

        int firstResult2 = result2.charAt(0);
        int secondResult2 = result2.charAt(2);

        if(firstResult2 > secondResult2){
            win++;
        }else if(firstResult2 == secondResult2){
            drawn++;
        }else {
            losses++;
        }

        int firstResult3 = result3.charAt(0);
        int secondResult3 = result3.charAt(2);

        if(firstResult3 > secondResult3){
            win++;
        }else if(firstResult3 == secondResult3){
            drawn++;
        }else {
            losses++;
        }

        System.out.printf("Team won %d games.%n", win);
        System.out.printf("Team lost %d games.%n", losses);
        System.out.println("Drawn games: " + drawn);
    }
}





