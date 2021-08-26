package Alexandria.ui.menu.commands.mainmenu;

import Alexandria.data.LibraryFileAccess;
import Alexandria.models.Library;
import Alexandria.ui.menu.commands.MenuCommand;

import java.io.IOException;
import java.util.Scanner;

public class SaveLibraryToFile implements MenuCommand {
    private Library library;

    public SaveLibraryToFile(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter file name to save: ");
        String filename = keyboard.nextLine().trim();
        try {
            LibraryFileAccess file = new LibraryFileAccess(filename);
            file.saveLibraryFile(this.library);
            System.out.println("\n\nFile saved.");
        } catch (IOException e) {
            System.out.println("File save error.");
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public String getCommandName() {
        return "Save Library to File";
    }
}
