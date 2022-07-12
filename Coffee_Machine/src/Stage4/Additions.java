package Stage4;

public class Additions {
    public static int[] espresso(int[] coffeeMachine) {
        int[] espresso = {250, 0, 16, 1, -4};
        if (checkResources(coffeeMachine, espresso)) {
            System.out.println("I have enough resources, making you a coffee!");
            for (int i = 0; i < coffeeMachine.length; i++) {
                coffeeMachine[i] -= espresso[i];
            }
        }
        return coffeeMachine;
    }
    public static int[] latte(int[] coffeeMachine) {
        int[] latte = {350, 75, 20, 1, -7};
        if (checkResources(coffeeMachine, latte)) {
            System.out.println("I have enough resources, making you a coffee!");
            for (int i = 0; i < coffeeMachine.length; i++) {
                coffeeMachine[i] -= latte[i];
            }
        }
        return coffeeMachine;
    }
    public static int[] cappuccino(int[] coffeeMachine) {
        int[] cappuccino = {200, 100, 12, 1, -6};
        if (checkResources(coffeeMachine, cappuccino)) {
            System.out.println("I have enough resources, making you a coffee!");
            for (int i = 0; i < coffeeMachine.length; i++) {
                coffeeMachine[i] -= cappuccino[i];
            }
        }
        return coffeeMachine;
    }
    public static boolean checkResources(int[] coffeeMachine, int[] coffee) {
        boolean check = true;
        if (coffeeMachine[0] < coffee[0]) {
            System.out.println("Sorry, not enough water!");
            check = false;
        } else if (coffeeMachine[1] < coffee[1]) {
            System.out.println("Sorry, not enough milk!");
            check = false;
        } else if (coffeeMachine[2] < coffee[2]) {
            System.out.println("Sorry, not enough coffee beans!");
            check = false;
        } else if (coffeeMachine[3] < coffee[3]) {
            System.out.println("Sorry, not enough disposable cups!");
            check = false;
        }
        return check;
    }
}
