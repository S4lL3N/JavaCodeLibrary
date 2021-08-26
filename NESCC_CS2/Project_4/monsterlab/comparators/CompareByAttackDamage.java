/**
 * -------------------------------------------------
 * File name: CompareByAttackDamage.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Shae Allen
 * Email: sallen14@stumail.northeaststate.edu
 * Course: CISP 1020 A70
 * Creation date: Apr 25, 2020
 * -------------------------------------------------
 */
package ProjectFour.monsterlab.comparators;

import ProjectFour.monsterlab.models.Monster;

import java.util.Comparator;

public class CompareByAttackDamage implements Comparator<Monster> {
    @Override
    public int compare(Monster m1, Monster m2) {
        return m1.getAttackDamage() - m2.getAttackDamage();
    }
}
