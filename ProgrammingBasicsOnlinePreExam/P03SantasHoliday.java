package ProgrammingBasicsOnlinePreExam;

import java.util.Scanner;

public class P03SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int days = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String assessment = scanner.nextLine();


        double costOfStay = 0;



        if (typeOfRoom.equals("room for one person")) {
            costOfStay = (days - 1) * 18;

        } else if (typeOfRoom.equals("apartment")) {
            costOfStay = (days - 1) * 25;
            if (days < 10) {
                costOfStay = costOfStay - (costOfStay * 0.30);
            } else if (days > 10 && days < 15) {
                costOfStay = costOfStay - (costOfStay * 0.35);
            } else if (days >= 15) {
                costOfStay = costOfStay - (costOfStay * 0.50);
            }
        } else if (typeOfRoom.equals("president apartment")) {
            costOfStay = (days - 1) * 35;
            if (days < 10) {
                costOfStay = costOfStay - (costOfStay * 0.10);
            } else if (days > 10 && days < 15) {
                costOfStay = costOfStay - (costOfStay * 0.15);
            } else if (days >= 15) {
                costOfStay = costOfStay - (costOfStay * 0.20);
            }
        }

        if (assessment.equals("positive")) {
           costOfStay = costOfStay + (costOfStay * 0.25);
        } else if (assessment.equals("negative")) {
            costOfStay = costOfStay - (costOfStay * 0.10);
        }
        System.out.printf("%.2f", costOfStay);

    }
}
