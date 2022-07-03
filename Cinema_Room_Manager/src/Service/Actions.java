package Service;

import java.util.Scanner;
import static Service.Additions.*;

public class Actions {
    public static void showSeats(char[][] hall) {
        int[] row = new int[hall[0].length];
        for (int i = 0; i < row.length; i++) {
            row[i] = i + 1;
        }
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 0; i < row.length; i++) {
            System.out.print(" " + row[i]);
        }
        System.out.println();
        for (int i = 0; i < hall.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < hall[i].length; j++) {
                System.out.print(hall[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static char[][] buyTicket(char[][] hall) {
        int[][] tickets = createPrices(hall);
        Scanner sc = new Scanner(System.in);
        boolean noErrors;
        int row, seat;
        do {
            System.out.println("Enter a row number:");
            row = sc.nextInt() - 1;
            System.out.println("Enter a seat number in that row:");
            seat = sc.nextInt() - 1;
            noErrors = checkErrors(hall, row, seat);
        } while (!noErrors);
        System.out.println("Ticket price: $" + tickets[row][seat]);
        hall[row][seat] = 'B';
        return hall;
    }
    public static void showStatistics(char[][] hall) {
        int purchasedTickets = 0;
        double percentage;
        int currentIncome = 0;
        int totalIncome = 0;
        int[][] tickets = createPrices(hall);
        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
                if (hall[i][j] == 'B') {
                    purchasedTickets++;
                    currentIncome += tickets[i][j];
                }
                totalIncome += tickets[i][j];
            }
        }
        percentage = (double) purchasedTickets * 100 / (hall.length * hall[0].length);
        System.out.println("Number of purchased tickets: " + purchasedTickets);
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
        System.out.println("Current income: $" + currentIncome);
        System.out.println("Total income: $" + totalIncome);
    }
}
