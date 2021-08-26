package Alexandria.ui.menu.commands.additems;

import Alexandria.models.Library;
import Alexandria.models.periodical.Magazine;
import Alexandria.ui.menu.commands.MenuCommand;

import java.util.Scanner;

public class AddMagazine implements MenuCommand {
    private final String COMMAND_NAME = "Add Magazine";
    private Library library;

    public AddMagazine(Library library) {
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

        System.out.print("Enter magazine ID: ");
        id = keyboard.nextLine();
        System.out.print("Enter magazine name: ");
        title = keyboard.nextLine();
        System.out.print("Enter magazine year: ");
        year = keyboard.nextLine();
        System.out.print("Enter magazine volume number: ");
        volumeNumber = keyboard.nextLine();

        try {
            this.library.addItem( new Magazine(id, title, year, volumeNumber) );
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Magazine added to library.");
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
