/**
 * -------------------------------------------------
 * File name: MenuCommand.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Shae Allen
 * Course: CISP 1020
 * Creation date: Apr 19, 2020
 * -------------------------------------------------
 */

package ProjectFour.monsterlab.ui.menu.commands;

public interface MenuCommand {
   void execute();
   boolean isExit();
   String getCommandName();
}

