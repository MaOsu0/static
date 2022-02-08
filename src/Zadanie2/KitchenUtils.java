package Zadanie2;

import java.util.Scanner;

public class KitchenUtils {
    final static double SPOON_SMALL_CAPACITY = 5;
    final static double SPOON_BIG_CAPACITY = 15;
    final static double GLASS_CAPACITY = 250;

    static Scanner scanner = new Scanner(System.in);

    static void Cup () {
        System.out.println("Proszę podać ilość szklanek");
        double cupQuantity = scanner.nextDouble();
        System.out.println("Potrzebna ilość ml to " + (cupQuantity * GLASS_CAPACITY));
    }

    static void Small_Spoon () {
        System.out.println("Proszę podać ilość szklanek");
        double smallSpoonQuantity = scanner.nextDouble();
        System.out.println("Potrzebna ilość ml to " + (smallSpoonQuantity * SPOON_SMALL_CAPACITY));
    }

    static void Big_Spoon () {
        System.out.println("Proszę podać ilość szklanek");
        double bigSpoonQuantity = scanner.nextDouble();
        System.out.println("Potrzebna ilość ml to " + (bigSpoonQuantity * SPOON_BIG_CAPACITY));
    }
}
