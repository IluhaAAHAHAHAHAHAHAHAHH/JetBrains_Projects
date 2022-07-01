package Controller;

import java.io.*;
import static Service.Serv.*;
import static Service.CheckWin.*;

public class TicTac {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int gridLength = 3;
        char[][] grid = createGrid(gridLength);
        printGrid(grid);
        for (int move = 1; move <= 9; move++) {
            System.out.println("Enter the coordinates: ");
            String cords = br.readLine();
            int cordX;
            int cordY;
            if (!checkIfInputInt(cords)) {
                System.out.println("You should enter numbers!");
                move--;
                continue;
            }
            cordX = Integer.parseInt(String.valueOf(cords.charAt(0)));
            cordY = Integer.parseInt(String.valueOf(cords.charAt(2)));
            if (!checkCords(cordX, cordY)) {
                System.out.println("Coordinates should be from 1 to 3!");
                move--;
                continue;
            }
            if (!checkOccupation(cordX, cordY, grid)) {
                System.out.println("This cell is occupied! Choose another one!");
                move--;
                continue;
            }
            enterCoordinate(move, grid, cordX, cordY);
            printGrid(grid);
            if (checkHorizontals(grid) || checkVerticals(grid) || checkDiagonals(grid) || checkDraw(grid)) {
                break;
            }
        }
    }
}
