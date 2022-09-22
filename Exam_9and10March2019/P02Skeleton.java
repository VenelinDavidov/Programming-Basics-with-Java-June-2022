package Exam_9and10March2019;

import java.util.Scanner;

public class P02Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int recordMinutes = Integer.parseInt(scanner.nextLine());
        int recordSeconds = Integer.parseInt(scanner.nextLine());
        double distanceInMetres = Double.parseDouble(scanner.nextLine());
        int secondsPerHundredMetres = Integer.parseInt(scanner.nextLine());

        double recordInSecond = recordMinutes * 60 + recordSeconds;
        double additionSeconds = (distanceInMetres / 120) * 2.5;
        double timeMarin = (distanceInMetres / 100) * secondsPerHundredMetres - additionSeconds;

        if (timeMarin > recordInSecond) {
            System.out.printf("No, Marin failed! He was %.3f second slower.", timeMarin - recordInSecond);
        } else {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", timeMarin);
        }

    }
}
