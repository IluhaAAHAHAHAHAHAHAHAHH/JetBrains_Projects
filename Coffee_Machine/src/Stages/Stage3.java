package Stages;

import java.util.Arrays;
import java.util.Scanner;

public class Stage3 {
    final static int WATER = 200;
    final static int MILK = 50;
    final static int COFFEE_BEANS = 15;
    final static int[] INGREDIENTS = {WATER, MILK, COFFEE_BEANS};
    public static void main(String[] args) {
        int[] maxIngredients = maxIngredients();
        int cups = howManyCups();
        int maxCups = calculateMaxCups(cups, maxIngredients);
        resolution(cups, maxCups);
    }
    public static void resolution(int cups, int maxCups) {
        switch (checker(cups, maxCups)) {
            default:
                break;
            case 0:
                //
                System.out.println("Yes, I can make that amount of coffee");
                break;
            case 1:
                //cups > maxCups
                System.out.println("No, I can make only " + maxCups + " cup(s) of coffee");
                break;
            case 2:
                //cups < maxCups
                System.out.println("Yes, I can make that amount of coffee (and even" + (maxCups - cups) + " more than that)");
                break;
        }
    }
    public static int checker (int cups, int maxCups) {
        int checker = 0;
        if (cups == maxCups) {
            checker = 0;
        } else if (cups > maxCups) {
            checker = 1;
        } else if (cups < maxCups) {
            checker = 2;
        }
        return checker;
    }
    public static int[] maxIngredients() {
        Scanner sc = new Scanner(System.in);
        int[] maxIngredients = new int[3];
        System.out.println("How many ml of water the coffee machine has:");
        maxIngredients[0] = sc.nextInt();
        System.out.println("How many ml of milk the coffee machine has:");
        maxIngredients[1] = sc.nextInt();
        System.out.println("How many grams of coffee beans the coffee machine has:");
        maxIngredients[2] = sc.nextInt();
        return maxIngredients;
    }
    public static int howManyCups() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = sc.nextInt();
        return cups;
    }
    public static int calculateMaxCups(int cups, int[] maxIngredients) {
        int[] maxCupsArray = maxIngredients;
        for (int i = 0; i < maxCupsArray.length; i++) {
            maxCupsArray[i] /= INGREDIENTS[i];
        }
        int maxCups = Arrays.stream(maxCupsArray).min().getAsInt();
        return maxCups;
    }
}
