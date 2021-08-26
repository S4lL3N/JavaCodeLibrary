/**
 * -------------------------------------------------
 * File name: LoadEncounterFromFile.java
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

public class LoadEncounterFromFile implements MenuCommand {
    private final String COMMAND_NAME = "Load Encounter";
    private Encounter encounter;

    public LoadEncounterFromFile(Encounter encounter) {
        this.encounter = encounter;
    }
    @Override
    public void execute() {
        //ConsoleMenu menu = new ConsoleMenu(COMMAND_NAME);
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the file name to load: ");

        String filename = keyboard.nextLine().trim();
        try {
            FileAccess file = new FileAccess(filename);
            file.openEncounterFile(this.encounter);

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
        return COMMAND_NAME;
    }
}
