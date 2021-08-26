/**
 * -------------------------------------------------
 * File name: SortMonsters.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Shae Allen
 * Email: sallen14@stumail.northeaststate.edu
 * Course: CISP 1020 A70
 * Creation date: Apr 25, 2020
 * -------------------------------------------------
 */
package ProjectFour.monsterlab.ui.menu.commands.mainmenu;

import ProjectFour.monsterlab.models.Encounter;
import ProjectFour.monsterlab.ui.menu.ConsoleMenu;
import ProjectFour.monsterlab.ui.menu.commands.MenuCommand;
import ProjectFour.monsterlab.ui.menu.commands.addmonsters.Home;
import ProjectFour.monsterlab.ui.menu.commands.sortmonsters.SortByArmorClass;
import ProjectFour.monsterlab.ui.menu.commands.sortmonsters.SortByAttackDamage;
import ProjectFour.monsterlab.ui.menu.commands.sortmonsters.SortByHitPoints;
import ProjectFour.monsterlab.ui.menu.commands.sortmonsters.SortByName;

public class SortMonsters implements MenuCommand {
    private final String COMMAND_NAME = "Sort Monsters";
    private Encounter encounter;

    public SortMonsters(Encounter encounter) {
        this.encounter = encounter;
    }

    @Override
    public void execute() {
        ConsoleMenu menu = new ConsoleMenu(COMMAND_NAME);

        menu.addCommand(new SortByName(this.encounter));
        menu.addCommand(new SortByHitPoints(this.encounter));
        menu.addCommand(new SortByArmorClass(this.encounter));
        menu.addCommand(new SortByAttackDamage(this.encounter));


        menu.addCommand(new Home());

        menu.show();
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
