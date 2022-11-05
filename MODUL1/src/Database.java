import java.util.List;
import java.util.Locale.Category;
import java.util.ArrayList;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class
    List <String> menuList = new ArrayList<>();

    // TODO Create Method to Insert Menu to Database
    public void InsertMenu (Menu menu) {
        listMenu.add(menu);
    }

    // TODO Create Method to Show Menu from Database
    public void showMenu () {
        System.out.println("Menu");
        System.out.println("=======================");
            for (int i = 0; i < listMenu.size(); i++) {
                System.out.println((i+1) + "." + listMenu.get(i).name + "("+ listMenu.get(i).Category +") Rp." + listMenu.get(i).price + "\n");
            }

    }

    // TODO Create Method to Search Menu from Database
    public void search Menu () {
        System.out.println("Masukkan Nama Menu : " + Menu);
    }
}
