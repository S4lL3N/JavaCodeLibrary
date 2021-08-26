/**
 * -------------------------------------------------
 * File name: Troll.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Shae Allen
 * Course and section: 1020
 * Creation date: Apr 5, 2020
 * -------------------------------------------------
 */
package ProjectFour.monsterlab.models;
import ProjectFour.util.SimpleDiceRoller;

import java.io.Serializable;

public class Troll extends Monster implements Serializable {
   private static int numTrolls = 1;
   private static final int TROLL_MAX_HP = 120;
   private static final int TROLL_ATTACK_DAMAGE = 12;
   private static final int TROLL_ARMOR_CLASS = 13;

   public Troll() {
      super("Troll " + numTrolls, SimpleDiceRoller.roll(TROLL_MAX_HP), TROLL_ATTACK_DAMAGE, TROLL_ARMOR_CLASS);
      numTrolls += 1;
   }

   @Override
   public String toString() {
      return "Troll{} " + super.toString();
   }
}
