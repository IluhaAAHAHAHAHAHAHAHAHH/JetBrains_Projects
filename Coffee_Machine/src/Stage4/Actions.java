package Stage4;

import java.util.Scanner;

import static Stage4.Additions.*;

public class Actions {
    public static int[] buy(int[] coffeeMachine) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to buy& 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String input = sc.next();
        switch (input) {
            case "1":
                espresso(coffeeMachine);
                break;
            case "2":
                latte(coffeeMachine);
                break;
            case "3":
                cappuccino(coffeeMachine);
                break;
            case "back":
                break;
        }
        return coffeeMachine;
    }
    public static int[] fill(int[] coffeeMachine) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many ml of water the coffee machine has:");
        coffeeMachine[0] += sc.nextInt();
        System.out.println("How many ml of milk the coffee machine has:");
        coffeeMachine[1] += sc.nextInt();
        System.out.println("How many grams of coffee beans the coffee machine has:");
        coffeeMachine[2] += sc.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        coffeeMachine[3] += sc.nextInt();
        return coffeeMachine;
    }
    public static int[] take(int[] coffeeMachine) {
        System.out.println("I gave you $" + coffeeMachine[4]);
        coffeeMachine[4] = 0;
        return coffeeMachine;
    }
    public static void remaining(int[] coffeeMachine) {
        System.out.println("The coffee machine has:\n" +
                coffeeMachine[0] + " ml of water\n" +
                coffeeMachine[1] + " ml of milk\n" +
                coffeeMachine[2] + " g of coffee beans\n" +
                coffeeMachine[3] + " disposable cups\n" +
                "$" + coffeeMachine[4] + " of money");
        System.out.println();
    }
}
