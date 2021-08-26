/**
 * -------------------------------------------------
 * File name: Encounter.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Shae Allen
 * Course and section: 1020
 * Creation date: Apr 19, 2020
 * Edited By Shae Allen on 4/25/20
 * -------------------------------------------------
 */
package ProjectFour.monsterlab.models;

import ProjectFour.monsterlab.comparators.CompareByArmorClass;
import ProjectFour.monsterlab.comparators.CompareByAttackDamage;
import ProjectFour.monsterlab.comparators.CompareByHitPoints;
import ProjectFour.monsterlab.comparators.CompareByName;

import java.io.Serializable;
import java.util.ArrayList;

public class Encounter implements Serializable {
   private ArrayList<Monster> monsters;

   public Encounter() {
      this.monsters = new ArrayList<>();
   }

   public void addMonster(Monster monster) {
      this.monsters.add(monster);
   }

   public ArrayList<Monster> getMonsters() {
      return monsters;
   }

   public void setMonsters(ArrayList<Monster> monsters) {
      this.monsters = monsters;
   }

   public void sortMonstersByName() {
      this.monsters.sort(new CompareByName());
   }
   public void sortMonstersByHitPoints(){
      this.monsters.sort(new CompareByHitPoints());
   }
   public void sortMonstersByAttackDamage(){
      this.monsters.sort(new CompareByAttackDamage());
   }
   public void sortMonstersByArmorClass(){
      this.monsters.sort(new CompareByArmorClass());
   }

   @Override
   public String toString() {
      return "Encounter{" +
             "monsters=" + monsters +
             '}';
   }
}
