package Controller;

import static Service.Additions.createArray;
import static Service.Serv.menu;

public class Cinema {
    public static void main(String[] args) {
        char[][] hall = createArray();
        menu(hall);
    }
}
