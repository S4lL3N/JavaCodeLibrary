/**
 * -------------------------------------------------
 * File name: AddWargs.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Shae Allen
 * Email: sallen14@stumail.northeaststate.edu
 * Course: CISP 1020 A70
 * Creation date: Apr 25, 2020
 * -------------------------------------------------
 */
package ProjectFour.monsterlab.ui.menu.commands.addmonsters;

import ProjectFour.monsterlab.models.Encounter;
import ProjectFour.monsterlab.models.Warg;
import ProjectFour.monsterlab.ui.menu.commands.MenuCommand;

import java.util.Scanner;

public class AddWargs implements MenuCommand {
    private final String COMMAND_NAME = "Add wargs";
    private Encounter encounter;

    public AddWargs(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        Scanner keyboard = new Scanner(System.in);
        int numWargsToGenerate = 0;

        System.out.print("Number of Wargs to generate: ");
        numWargsToGenerate = keyboard.nextInt();

        for (int i = 0; i < numWargsToGenerate; i++) {
            encounter.addMonster(new Warg());
        }

        System.out.println("Added " +  numWargsToGenerate + " Wargs.");
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
