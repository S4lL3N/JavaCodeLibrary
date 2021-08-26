/**
 * -------------------------------------------------
 * File name: ShowAllMonsters.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Shae Allen
 * Course: CISP 1020
 * Creation date: Apr 19, 2020
 * -------------------------------------------------
 */
package ProjectFour.monsterlab.ui.menu.commands.mainmenu;

import ProjectFour.monsterlab.models.Encounter;
import ProjectFour.monsterlab.models.Monster;
import ProjectFour.monsterlab.ui.menu.commands.MenuCommand;

public class ShowAllMonsters implements MenuCommand {
   private final String COMMAND_NAME = "Show All Monsters";
   private Encounter encounter;

   public ShowAllMonsters(Encounter encounter) {
      this.encounter = encounter;
   }

   @Override
   public void execute() {
      if(encounter.getMonsters().size() == 0){
         System.out.println("No Monsters in Encounter");
      }else{
         for (Monster monster : encounter.getMonsters()) {
            System.out.println(monster.toString());
         }
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
