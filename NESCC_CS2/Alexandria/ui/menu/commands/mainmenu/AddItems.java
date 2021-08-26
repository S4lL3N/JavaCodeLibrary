package Alexandria.ui.menu.commands.mainmenu;

import Alexandria.models.Library;
import Alexandria.ui.menu.ConsoleMenu;
import Alexandria.ui.menu.commands.MenuCommand;
import Alexandria.ui.menu.commands.additems.*;

public class AddItems implements MenuCommand {
    private final String COMMAND_NAME = "Add Item";
    private Library library;

    public AddItems(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        ConsoleMenu menu = new ConsoleMenu(COMMAND_NAME);

        menu.addCommand(new AddBook(this.library));
        menu.addCommand(new AddVHS(this.library));
        menu.addCommand(new AddDVD(this.library));
        menu.addCommand(new AddBluRay(this.library));
        menu.addCommand(new AddJournal(this.library));
        menu.addCommand(new AddNewspaper(this.library));
        menu.addCommand(new AddMagazine(this.library));

        menu.addCommand(new Home());

        menu.show();
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
