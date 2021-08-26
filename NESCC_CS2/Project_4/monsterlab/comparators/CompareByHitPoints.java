/**
 * -------------------------------------------------
 * File name: CompareByHitPoints.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Shae Allen
 * Course: CISP 1020
 * Creation date: Apr 19, 2020
 * -------------------------------------------------
 */
package ProjectFour.monsterlab.comparators;

import ProjectFour.monsterlab.models.Monster;

import java.util.Comparator;

public class CompareByHitPoints implements Comparator<Monster> {
   @Override
   public int compare(Monster m1, Monster m2) {
      return m1.getHitPoints() - m2.getHitPoints();
   }
}
