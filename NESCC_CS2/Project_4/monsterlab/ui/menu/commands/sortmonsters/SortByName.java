/**
 * -------------------------------------------------
 * File name: SortByName.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Shae Allen
 * Course: CISP 1020
 * Creation date: Apr 19, 2020
 * -------------------------------------------------
 */
package ProjectFour.monsterlab.ui.menu.commands.sortmonsters;

import ProjectFour.monsterlab.models.Encounter;
import ProjectFour.monsterlab.ui.menu.commands.MenuCommand;

public class SortByName implements MenuCommand {
   private final String COMMAND_NAME = "Sort by Name";
   private Encounter encounter;

   public SortByName(Encounter encounter) {
      this.encounter = encounter;
   }

   @Override
   public void execute() {
      System.out.println("Sorting...");
      this.encounter.sortMonstersByName();
      System.out.println("Monsters sorted by name");
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
