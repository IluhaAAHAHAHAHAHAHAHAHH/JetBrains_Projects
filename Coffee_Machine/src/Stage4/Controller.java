package Stage4;

import java.util.Scanner;

import static Stage4.Actions.*;

public class Controller {
    final static int DOLLARS = 550;
    final static int WATER = 400;
    final static int MILK = 540;
    final static int COFFEE_BEANS = 120;
    final static int CUPS = 9;
    final static int[] COFFEE_MACHINE = {WATER, MILK, COFFEE_BEANS, CUPS, DOLLARS};
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int[] coffeeMachine = COFFEE_MACHINE;
        String action;
        int exit = 0;
        while (exit == 0) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = sc.next();
            if (action.equals("exit")) {
                exit = 1;
            }
            switch (action) {
                case "buy":
                    buy(coffeeMachine);
                    break;
                case "fill":
                    fill(coffeeMachine);
                    break;
                case "take":
                    take(coffeeMachine);
                    break;
                case "remaining":
                    remaining(coffeeMachine);
                    break;
                case "exit":
                    break;
            }
        }
    }
}
