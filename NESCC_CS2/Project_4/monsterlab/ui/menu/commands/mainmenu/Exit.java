/**
 * -------------------------------------------------
 * File name: Exit.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Shae Allen
 * Course: CISP 1020
 * Creation date: Apr 19, 2020
 * -------------------------------------------------
 */

package ProjectFour.monsterlab.ui.menu.commands.mainmenu;

import ProjectFour.monsterlab.ui.menu.commands.MenuCommand;

public class Exit implements MenuCommand {
   private final String COMMAND_NAME = "Exit";
   @Override
   public void execute() {
      System.out.println("Exiting");
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
