/**
 * -------------------------------------------------
 * File name: EncounterGen.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Shae Allen
 * Course: CISP 1020
 * Creation date: Apr 19, 2020
 * -------------------------------------------------
 */

package ProjectFour.monsterlab.ui;

import ProjectFour.monsterlab.models.Encounter;
import ProjectFour.monsterlab.ui.menu.ConsoleMenu;
import ProjectFour.monsterlab.ui.menu.commands.mainmenu.*;

public class EncounterGen {
   public static void main(String[] args) {
      final String MENU_NAME = "MONSTER LAB! Encounter Manager\n" +
                              "------------------------------";
   
      Encounter encounter = new Encounter();
   
      ConsoleMenu menu = new ConsoleMenu(MENU_NAME);
   
      //TODO add MenuCommand objects to menu, for load, save, and sort commands (Hint 3 LOC)
      menu.addCommand(new AddMonsters(encounter));
      menu.addCommand(new ShowAllMonsters(encounter));
      menu.addCommand(new SortMonsters(encounter));
      menu.addCommand(new SaveEncounterToFile(encounter));
      menu.addCommand(new LoadEncounterFromFile(encounter));
      menu.addCommand(new Exit());
   
      menu.show();
   }
}
