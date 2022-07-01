package Service;

public class CheckWin {
    public static boolean checkHorizontals(char[][] grid) {
        boolean horizontalWin = false;
        boolean xWin = false;
        boolean oWin = false;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2] && grid[i][0] != '_') {
                if (grid[i][0] == 'X') {
                    xWin = true;
                    System.out.println("X wins");
                    break;
                }
                if (grid[i][0] == 'O') {
                    oWin = true;
                    System.out.println("O wins");
                    break;
                }
            }
        }
        if (xWin || oWin) {
            horizontalWin = true;
        }
        return horizontalWin;
    }
    public static boolean checkVerticals(char[][] grid) {
        boolean verticalWin = false;
        boolean xWin = false;
        boolean oWin = false;
        for (int i = 0; i < grid.length; i++) {
            if (grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i] && grid[0][i] != '_') {
                if (grid[0][i] == 'X') {
                    xWin = true;
                    System.out.println("X wins");
                    break;
                }
                if (grid[0][i] == 'O') {
                    oWin = true;
                    System.out.println("O wins");
                    break;
                }
            }
        }
        if (xWin || oWin) {
            verticalWin = true;
        }
        return verticalWin;
    }
    public static boolean checkDiagonals(char[][] grid) {
        boolean diagonalL = false;
        boolean diagonalR = false;
        if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[1][1] != '_') {
            diagonalL = true;
        }
        if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0] && grid[1][1] != '_') {
            diagonalR = true;
        }
        boolean diagonalWin = diagonalL || diagonalR;
        if (diagonalWin) {
            if (grid[1][1] == 'X') {
                System.out.println("X wins");
            }
            if (grid[1][1] == 'O') {
                System.out.println("O wins");
            }
        }
        return diagonalWin;
    }
}
