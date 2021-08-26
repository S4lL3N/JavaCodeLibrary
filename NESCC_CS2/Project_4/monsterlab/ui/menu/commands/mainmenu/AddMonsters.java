/**
 * -------------------------------------------------
 * File name: AddMonsters.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Shae Allen
 * Course: CISP 1020
 * Creation date: Apr 19, 2020
 * -------------------------------------------------
 */

package ProjectFour.monsterlab.ui.menu.commands.mainmenu;

import ProjectFour.monsterlab.models.Encounter;
import ProjectFour.monsterlab.ui.menu.ConsoleMenu;
import ProjectFour.monsterlab.ui.menu.commands.MenuCommand;
import ProjectFour.monsterlab.ui.menu.commands.addmonsters.*;

public class
AddMonsters implements MenuCommand {
   private final String COMMAND_NAME = "Add Monsters";
   private Encounter encounter;

   public AddMonsters(Encounter encounter) {
      this.encounter = encounter;
   }

   @Override
   public void execute() {
      ConsoleMenu menu = new ConsoleMenu(COMMAND_NAME);
   
      menu.addCommand(new AddOrcs(this.encounter));
      menu.addCommand(new AddTrolls(this.encounter));
      //TODO You will add the MenuCommand object here for AddRandomMonsters, and an Add Monster MenuCommand for
      // each of your 3 Monster sub classes.(Hint: 4 LOC)
      menu.addCommand(new AddBalrogs(this.encounter));
      menu.addCommand(new AddNazguls(this.encounter));
      menu.addCommand(new AddWargs(this.encounter));
      menu.addCommand(new AddRandomMonsters(this.encounter));
   
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
