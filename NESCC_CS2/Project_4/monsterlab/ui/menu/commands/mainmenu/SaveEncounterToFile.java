/**
 * -------------------------------------------------
 * File name: SaveEncounterToFile.java
 * Project name: Monster Lab
 * -------------------------------------------------
 * Creator's name: Shae Allen
 * Email: sallen14@nstumail.northeaststate.edu
 * Course and section: 1020 A70
 * Creation date: Apr 26, 2020
 * -------------------------------------------------
 */
package ProjectFour.monsterlab.ui.menu.commands.mainmenu;

import ProjectFour.monsterlab.data.FileAccess;
import ProjectFour.monsterlab.models.Encounter;
import ProjectFour.monsterlab.ui.menu.commands.MenuCommand;


import java.util.Scanner;


public class SaveEncounterToFile implements MenuCommand {
    private final String COMMAND_NAME = "Save Encounter";
    private Encounter encounter;

    public SaveEncounterToFile(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        //ConsoleMenu menu = new ConsoleMenu(COMMAND_NAME);
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter file name to save: ");
        String filename = keyboard.nextLine().trim();
        try {
            FileAccess file = new FileAccess(filename);
            file.saveEncounterFile(this.encounter);
            System.out.println("\n\nFile saved.");
        } catch (Exception e) {
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
        return COMMAND_NAME;
    }
}
