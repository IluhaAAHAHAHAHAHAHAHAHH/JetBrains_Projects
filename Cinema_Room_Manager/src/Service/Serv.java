package Service;

import java.util.Scanner;

import static Service.Actions.*;

public class Serv {
    public static void menu(char[][] hall) {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            printMenu();
            input = sc.nextInt();
            switch (input) {
                default:
                    break;
                case 1:
                    //
                    showSeats(hall);
                    break;
                case 2:
                    //
                    buyTicket(hall);
                    break;
                case 3:
                    showStatistics(hall);
                case 0:
                    break;
            }
        } while (input != 0);
    }
    public static void printMenu() {
        System.out.println("\n1. Show the seats\n" +
                "2. Buy a ticket\n" +
                "3. Statistics\n" +
                "0. Exit\n");
    }
}
