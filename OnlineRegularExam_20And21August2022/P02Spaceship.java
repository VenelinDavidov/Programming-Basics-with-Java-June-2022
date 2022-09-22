package OnlineRegularExam_20And21August2022;

import java.util.Scanner;

public class P02Spaceship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double averageHeight = Double.parseDouble(scanner.nextLine());


        double volumeRocket = width * length * height;
        double volumeRoom = (averageHeight + 0.40) * 2 * 2;

        double people = Math.floor(volumeRocket / volumeRoom);

        if (people > 3 && people <= 10){
            System.out.printf("The spacecraft holds %.0f astronauts.", people);
        } else if (people < 3){
            System.out.println( "The spacecraft is too small.");
        } else if (people > 10){
            System.out.println("The spacecraft is too big.");
        }

    }
}
