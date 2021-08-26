/**
 * -------------------------------------------------
 * File name: AddBalrogs.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Shae Allen
 * Email: sallen14@stumail.northeaststate.edu
 * Course: CISP 1020 A70
 * Creation date: Apr 25, 2020
 * -------------------------------------------------
 */
package ProjectFour.monsterlab.ui.menu.commands.addmonsters;

import ProjectFour.monsterlab.models.Balrog;
import ProjectFour.monsterlab.models.Encounter;
import ProjectFour.monsterlab.ui.menu.commands.MenuCommand;

import java.util.Scanner;

public class AddBalrogs implements MenuCommand {
    private final String COMMAND_NAME = "Add Balrogs";
    private Encounter encounter;

    public AddBalrogs(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        Scanner keyboard = new Scanner(System.in);
        int numBalrogsToGenerate = 0;

        System.out.print("Number of Balrogs to generate: ");
        numBalrogsToGenerate = keyboard.nextInt();

        for (int i = 0; i < numBalrogsToGenerate; i++) {
            encounter.addMonster(new Balrog());
        }

        System.out.println("Added " +  numBalrogsToGenerate + " Balrogs.");
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
