package Service;

public class Serv {
    public static char[][] createGrid(int n) {
        char[][] grid = new char[n][n];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[i][j] = '_';
            }
        }
        return grid;
    }
    public static void printGrid(char[][] grid) {
        System.out.println("---------");
        System.out.println("|" + " " + grid[0][0] + " " + grid[0][1] + " " + grid[0][2] + " " + "|");
        System.out.println("|" + " " + grid[1][0] + " " + grid[1][1] + " " + grid[1][2] + " " + "|");
        System.out.println("|" + " " + grid[2][0] + " " + grid[2][1] + " " + grid[2][2] + " " + "|");
        System.out.println("---------");
    }
    public static void enterCoordinate(int move, char[][] grid, int cordX, int cordY) {
        if (move % 2 == 1) {
            grid[cordX - 1][cordY - 1] = 'X';
        } else {
            grid[cordX - 1][cordY - 1] = 'O';
        }
    }
    public static boolean checkIfInputInt(String cord) {
        //        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Character.isDigit(cord.charAt(0)) && Character.isDigit(cord.charAt(2));
    }
    public static boolean checkCords(int cordX, int cordY) {
        return cordX < 4 && cordX > 0 && cordY < 4 && cordY > 0;
    }
    public static boolean checkOccupation(int cordX, int cordY, char[][] grid) {
        return grid[cordX - 1][cordY - 1] == '_';
    }
    public static boolean checkDraw(char[][] grid) {
        int counter = 0;
        for (char[] i: grid) {
            for (char j : i) {
                if (j == '_') {
                    counter++;
                }
            }
        }
        boolean draw = counter == 0;
        if (draw) {
            System.out.println("Draw");
        }
        return draw;
    }
}
