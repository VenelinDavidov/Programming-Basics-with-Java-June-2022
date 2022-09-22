package OnlineExam15and16June2019;

import java.util.Scanner;

public class P01SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int seasonCount = Integer.parseInt(scanner.nextLine());
        int episodesCount = Integer.parseInt(scanner.nextLine());
        double episodeTime = Integer.parseInt(scanner.nextLine());


        double advertisementTime  =  episodeTime * 0.20;
        double episodeTimeWithAdvertisement = episodeTime + advertisementTime;
        double additionallyTime = seasonCount * 10;
        double allTimeSerial = episodeTimeWithAdvertisement * episodesCount * seasonCount + additionallyTime;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", name, Math.floor(allTimeSerial) );
    }
}
