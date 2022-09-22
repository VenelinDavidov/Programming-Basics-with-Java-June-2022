package OnlineRegularExam_20And21August2022;

import java.util.Scanner;

public class P01RoomPainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int box = Integer.parseInt(scanner.nextLine());
        int wallpaper = Integer.parseInt(scanner.nextLine());
        double priceGloves = Double.parseDouble(scanner.nextLine());
        double priceBrush = Double.parseDouble(scanner.nextLine());


        double allPricePaint = box * 21.50;
        double allPriceWallpaper = wallpaper * 5.20;
        double needGloves = Math.ceil(wallpaper * 0.35);
        double needBrush = Math.floor(box * 0.48);

        double allPriceGlove = needGloves * priceGloves;
        double allPriceBrush = needBrush * priceBrush;

        double allPriceProduct = allPricePaint + allPriceWallpaper +  allPriceGlove + allPriceBrush;
        double value = allPriceProduct / 15;

        System.out.printf("This delivery will cost %.2f lv.", value);;
    }
}
