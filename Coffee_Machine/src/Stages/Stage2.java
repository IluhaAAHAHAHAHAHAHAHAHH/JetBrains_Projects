package Stages;

import java.util.Scanner;

public class Stage2 {
    final static int WATER = 200;
    final static int MILK = 50;
    final static int COFFEE_BEANS = 15;
    final static int[] INGREDIENTS = {WATER, MILK, COFFEE_BEANS};
    public static void main(String[] args) {
        calculateIngredients();
    }
    public static void calculateIngredients() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = sc.nextInt();
        int[] currentIngredients = INGREDIENTS;
        for (int i = 0; i < currentIngredients.length; i++) {
            currentIngredients[i] *= cups;
        }
        System.out.println("For " + cups + " cups of coffee you will need:\n" +
                currentIngredients[0] + " ml of water\n" +
                currentIngredients[1] + " ml of milk\n" +
                currentIngredients[2] + " g of coffee beans");
    }
}
