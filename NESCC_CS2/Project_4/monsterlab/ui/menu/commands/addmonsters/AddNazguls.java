/**
 * -------------------------------------------------
 * File name: AddNazguls.java
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
import ProjectFour.monsterlab.models.Nazgul;
import ProjectFour.monsterlab.ui.menu.commands.MenuCommand;

import java.util.Scanner;

public class AddNazguls implements MenuCommand {
    private final String COMMAND_NAME = "Add Nazgûls";
    private Encounter encounter;

    public AddNazguls(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        Scanner keyboard = new Scanner(System.in);
        int numNazgulsToGenerate = 0;

        System.out.print("Number of Nazgûls to generate: ");
        numNazgulsToGenerate = keyboard.nextInt();

        for (int i = 0; i < numNazgulsToGenerate; i++) {
            encounter.addMonster(new Nazgul());
        }

        System.out.println("Added " +  numNazgulsToGenerate + " Nazgûls.");
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
