package Exam_6And7July2019;

import java.util.Scanner;

public class P01PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double entrance = Double.parseDouble(scanner.nextLine());
        double sunLounger = Double.parseDouble(scanner.nextLine());
        double umbrella = Double.parseDouble(scanner.nextLine());

        double peopleEntrance = people * entrance;
        double needSunLounger = Math.ceil(people * 0.75);
        double priceSunLounger = needSunLounger * sunLounger;
        double needUmbrellas = Math.ceil(people * 0.50);
        double priceUmbrellas = needUmbrellas * umbrella;

        double allPrice = peopleEntrance + priceSunLounger + priceUmbrellas;

        System.out.printf("%.2f lv.", allPrice);

    }
}
