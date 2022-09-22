package NestedLoopsLab;

import java.util.Scanner;

public class P02MultiplicationTable {
    public static void main(String[] args) {

        for (int first = 1; first <= 10; first++) {
            for (int second = 1; second <= 10; second++) {
                int product = first * second;
                System.out.printf("%d * %d = %d%n", first, second, product);
            }

        }

    }
}
