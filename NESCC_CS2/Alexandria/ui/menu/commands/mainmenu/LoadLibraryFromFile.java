package Alexandria.ui.menu.commands.mainmenu;

import Alexandria.data.LibraryFileAccess;
import Alexandria.models.Library;
import Alexandria.ui.menu.commands.MenuCommand;

import java.util.Scanner;

public class LoadLibraryFromFile implements MenuCommand {
    private Library library;

    public LoadLibraryFromFile(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the file name to load: ");

        String filename = keyboard.nextLine().trim();
        try {
            LibraryFileAccess file = new LibraryFileAccess(filename);
            file.openLibraryFile(this.library);

        } catch (Exception e) {
            //System.out.println("\n======================= ERROR ========================");
            System.out.println("\n" + e.getMessage() + "\n");
            //System.out.println("======================================================");
        }
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public String getCommandName() {
        return "Load Library from File";
    }
}
