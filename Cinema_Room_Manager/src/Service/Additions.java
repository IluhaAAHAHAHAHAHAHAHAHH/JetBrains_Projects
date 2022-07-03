package Service;

import java.util.Scanner;

public class Additions {
    public static int[][] createPrices(char[][] hall) {
        int[][] tickets = new int[hall.length][hall[0].length];
        boolean checkEven = hall.length % 2 == 0;
        boolean checkLarge = hall.length * hall[0].length > 60;
        int cases = checkCases(checkEven, checkLarge);
        switch (cases) {
            case 1:
                //checkLarge&&checkEven
                for (int i = 0; i < hall.length; i++) {
                    for (int j = 0; j < hall[i].length; j++) {
                        if (i <= hall.length / 2) {
                            tickets[i][j] = 10;
                        } else {
                            tickets[i][j] = 8;
                        }
                    }
                }
                break;
            case 2:
                //checkLarge
                for (int i = 0; i < hall.length; i++) {
                    for (int j = 0; j < hall[i].length; j++) {
                        if (i < (hall.length - 1) / 2) {
                            tickets[i][j] = 10;
                        } else {
                            tickets[i][j] = 8;
                        }
                    }
                }
                break;
            case 3:
                //!checkLarge
                for (int i = 0; i < tickets.length; i++) {
                    for (int j = 0; j < tickets[i].length; j++) {
                        tickets[i][j] = 10;
                    }
                }
                break;
            default:
                break;
        }
        return tickets;
    }
    public static int checkCases(boolean checkEven, boolean checkLarge) {
        int cases;
        if (checkLarge) {
            if (checkEven) {
                cases = 1;
            } else {
                cases = 2;
            }
        } else {
            cases = 3;
        }
        return cases;
    }
    public static char[][] createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = sc.nextInt();
        char[][] hall = new char[rows][seats];
        //fill S
        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
                hall[i][j] = 'S';
            }
        }

        return hall;
    }
    public static void printPrices(int[][] tickets) {
        for (int[] i : tickets) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static boolean checkErrors(char[][] hall, int row, int seat) {
        boolean check = true;
        if (row + 1 > hall.length || seat + 1 > hall[0].length || row + 1 < 1 || seat + 1 < 1) {
            System.out.println("Wrong input!");
            check = false;
        } else if (hall[row][seat] == 'B') {
            System.out.println("That ticket has already been purchased!");
            check = false;
        }
        return check;
    }
}
