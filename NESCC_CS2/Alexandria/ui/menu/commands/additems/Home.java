package Alexandria.ui.menu.commands.additems;

import Alexandria.ui.menu.commands.MenuCommand;

public class Home implements MenuCommand {
    private final String COMMAND_NAME = "Home";

    @Override
    public void execute() {
        System.out.println(COMMAND_NAME);
    }

    @Override
    public boolean isExit() {
        return true;
    }

    @Override
    public String getCommandName() {
        return COMMAND_NAME;
    }
}
