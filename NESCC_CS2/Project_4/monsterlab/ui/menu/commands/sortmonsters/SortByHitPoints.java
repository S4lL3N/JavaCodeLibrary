/**
 * -------------------------------------------------
 * File name: SortByHitPoints.java
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

public class SortByHitPoints implements MenuCommand {
    private final String COMMAND_NAME = "Sort by Hit Points";
    private Encounter encounter;

    public SortByHitPoints(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        System.out.println("Sorting...");
        this.encounter.sortMonstersByHitPoints();
        System.out.println("Monsters sorted by Hit Points");
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
