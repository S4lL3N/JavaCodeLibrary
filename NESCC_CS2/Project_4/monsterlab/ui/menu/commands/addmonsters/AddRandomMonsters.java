/**
 * -------------------------------------------------
 * File name: AddRqndomMonsters.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Shae Allen
 * Email: sallen14@stumail.northeaststate.edu
 * Course: CISP 1020 A70
 * Creation date: Apr 25, 2020
 * -------------------------------------------------
 */
package ProjectFour.monsterlab.ui.menu.commands.addmonsters;

import ProjectFour.monsterlab.models.*;
import ProjectFour.monsterlab.ui.menu.commands.MenuCommand;
import ProjectFour.util.SimpleDiceRoller;


import java.util.Scanner;

public class AddRandomMonsters implements MenuCommand {
    private final String COMMAND_NAME = "Add Random Monsters";
    private Encounter encounter;

    public AddRandomMonsters(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        Scanner keyboard = new Scanner(System.in);
        int numMonstersToGenerate = 0;

        System.out.print("Number of Monsters to generate: ");
        numMonstersToGenerate = keyboard.nextInt();

        for (int i = 0; i < numMonstersToGenerate; i++) {
            encounter.addMonster(MonsterGenerator.getRandomMonster());
        }

        System.out.println("Added " +  numMonstersToGenerate + " Monsters.");
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
