package OnlineExam15and16June2019;

import java.util.Scanner;

public class P02MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeForPhotos = Integer.parseInt(scanner.nextLine());
        int numOfScene = Integer.parseInt(scanner.nextLine());
        int timeScene =Integer.parseInt(scanner.nextLine());

        double prepareTerrain = timeForPhotos * 0.15;
        double timeForScene = numOfScene * timeScene;

        double totalTime = timeForScene +prepareTerrain;

        if (timeForPhotos < totalTime) {
            System.out.println(String.format("You managed to finish the movie on time! You have %d minutes left!",
                    Math.round(totalTime - timeForPhotos)));
        } else {
            System.out.println(String.format("Time is up! To complete the movie you need %d minutes.",
                    Math.round(timeForPhotos - totalTime)));
        }
    }
}
