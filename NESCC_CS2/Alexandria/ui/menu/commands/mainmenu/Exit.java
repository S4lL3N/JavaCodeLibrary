package Alexandria.ui.menu.commands.mainmenu;

import Alexandria.ui.menu.commands.MenuCommand;

public class Exit implements MenuCommand {
    @Override
    public void execute() {
        System.out.println("Exiting");
    }

    @Override
    public boolean isExit() {
        return true;
    }

    @Override
    public String getCommandName() {
        return "Exit";
    }
}
