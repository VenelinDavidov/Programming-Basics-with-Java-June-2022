package ForLoop_Exercise;

import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());

        double pointsForTure = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            String stage = scanner.nextLine();

            switch (stage) {
                case "W":
                    points = points + 2000;
                    pointsForTure =pointsForTure + 2000;
                    count++;
                break;
                case "F":
                    points = points + 1200;
                    pointsForTure = pointsForTure +1200;
                    break;
                case "SF":
                    points = points + 720;
                    pointsForTure = pointsForTure +720;
                    break;
            }

        }
        double averageWinningpoints = Math.floor(pointsForTure /n);
        double winInProcent = count * 1.0 / n * 100;
        System.out.printf("Final points: %d%n", points);
        System.out.printf("Average points: %.0f%n",averageWinningpoints);
        System.out.printf("%.2f%%",winInProcent);
    }
}
