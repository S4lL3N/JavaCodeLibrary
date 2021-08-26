/**
 * -------------------------------------------------
 * File name: SortByArmorClass.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Shae Allen
 * Email: sallen14@stumail.northeaststate.edu
 * Course: CISP 1020 A70
 * Creation date: Apr 25, 2020
 * -------------------------------------------------
 */
package ProjectFour.monsterlab.ui.menu.commands.sortmonsters;

import ProjectFour.monsterlab.models.Encounter;
import ProjectFour.monsterlab.ui.menu.commands.MenuCommand;

public class SortByArmorClass implements MenuCommand {
    private final String COMMAND_NAME = "Sort by Armor Class";
    private Encounter encounter;

    public SortByArmorClass(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        System.out.println("Sorting...");
        this.encounter.sortMonstersByArmorClass();
        System.out.println("Monsters sorted by Armor Class");
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
