package Alexandria.ui.menu.commands.additems;

import Alexandria.models.Library;
import Alexandria.models.periodical.Newspaper;
import Alexandria.ui.menu.commands.MenuCommand;

import java.util.Scanner;

public class AddNewspaper implements MenuCommand {
    private final String COMMAND_NAME = "Add Newspaper";
    private Library library;

    public AddNewspaper(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        System.out.println(COMMAND_NAME);

        Scanner keyboard = new Scanner(System.in);

        String id;
        String year;
        String title;
        String volumeNumber;

        System.out.print("Enter newspaper ID: ");
        id = keyboard.nextLine();
        System.out.print("Enter newspaper name: ");
        title = keyboard.nextLine();
        System.out.print("Enter newspaper year: ");
        year = keyboard.nextLine();
        System.out.print("Enter newspaper volume number: ");
        volumeNumber = keyboard.nextLine();

        try {
            this.library.addItem( new Newspaper(id, title, year, volumeNumber) );
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Newspaper added to library.");
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public String getCommandName() {
        return COMMAND_NAME;
    }
}
