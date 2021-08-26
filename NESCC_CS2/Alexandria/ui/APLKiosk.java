package Alexandria.ui;

import Alexandria.models.Library;
import Alexandria.ui.menu.ConsoleMenu;
import Alexandria.ui.menu.commands.mainmenu.*;

public class APLKiosk {
    public static void main(String[] args) {
        ConsoleMenu menu = new ConsoleMenu("Welcome to the Alexandria Public Library");

        Library alexandria = new Library("APL");

        menu.addCommand(new LoadLibraryFromFile(alexandria));
        menu.addCommand(new SaveLibraryToFile(alexandria));
        menu.addCommand(new AddItems(alexandria));
        menu.addCommand(new SearchLibrary(alexandria));
        menu.addCommand(new ShowAllItems(alexandria));
        menu.addCommand(new AddItems(alexandria));
        menu.addCommand(new Exit());

        menu.show();
    }
}
