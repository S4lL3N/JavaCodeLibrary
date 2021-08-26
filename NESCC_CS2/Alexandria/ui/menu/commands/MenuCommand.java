package Alexandria.ui.menu.commands;

public interface MenuCommand {
    void execute();
    boolean isExit();
    String getCommandName();
}
