package ProjectOne;

import java.util.ArrayList;
/**
 *
 * Purpose: Encounter class, creates encounter objects.
 * - Overloaded constructor
 * - Getter methods: getEncounterName, getMonster
 * - Setter methods: N/A
 * - Public methods: addMonsterToEncounter, calculateTotalMonsters, calculateTotalHitPoints, calculateAverageArmorClass,
 *                   calculateAverageAttackDamage, toString
 */
public class Encounter {
   //variables
   private String encounterName;
   private ArrayList<Monster> monster = new ArrayList<>();


   //Constructor
   public Encounter(String encounterName) {
      this.encounterName = encounterName;
   
   }

   //Getters and Setters
   public String getEncounterName() {
      return encounterName;
   }

   public ArrayList<Monster> getMonster() {
      return monster;
   }

   //Methods
   /**
    *  Method description: This method instantiates a new monster object and adds it to the monster arraylist.
    *  Parameters: N/A
    *  Return: N/A
    */
   public void addMonsterToEncounter(String name, int hitPoints, int armorClass, int attackDamage){
      monster.add(new Monster(name,hitPoints,armorClass,attackDamage));
   
   }
   /**
    *  Method description: This method gets the size/length of the  monster array list to calculate the total amount of monsters.
    *  Parameters: N/A
    *  Return: monster.size()
    */
   public int calculateTotalMonsters(){
      //gets the size/length of the  monster array list to calculate the total amount of monsters.
      return monster.size();
   }
   /**
    * Method description: This method uses a enhanced for loop to go through the monster array list and add hit points for encounter.
    * Parameters: N/A
    * Return: totalHitPoints
    */
   public int calculateTotalHitPoints(){
      //uses a enhanced for loop to go through the monster array list and add hit points for encounter.
      int totalHitPoints = 0;
      for (Monster value : monster) {
         totalHitPoints += value.getHitPoints();
      }
   
      return totalHitPoints;
   }
   /**
    * Method description: This method uses a enhanced for loop to go through the monster array list and averages the armor class for the encounter.
    * Parameters: N/A
    * Return:avgArmorClass
    */
   public float calculateAverageArmorClass(){
      //uses a enhanced for loop to go through the monster array list and averages the armor class for the encounter.
      float totalArmorClass = 0;
      float avgArmorClass;
      for (Monster value : monster) {
         totalArmorClass += value.getArmorClass();
      }
      avgArmorClass = totalArmorClass / monster.size();
   
      return avgArmorClass;
   
   }
   /**
    * Method description: This method uses a enhanced for loop to go through the monster array list and averages the attack damage encounter.
    * Parameters: N/A
    * Return: avgAttackDamage
    */
   public float calculateAverageAttackDamage(){
      //uses a enhanced for loop to go through the monster array list and averages the attack damage encounter.
      float totalAttackDamage = 0;
      float avgAttackDamage;
   
      for (Monster value : monster) {
         totalAttackDamage += value.getAttackDamage();
      }
   
      avgAttackDamage = totalAttackDamage / monster.size();
   
      return avgAttackDamage;
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("Encounter Name: ").append(getEncounterName());
      sb.append("\nTotal Monsters: ").append(calculateTotalMonsters());
      sb.append("\nTotal Hit Points: ").append(calculateTotalHitPoints());
      sb.append("\nAverage Armor Class: ").append(calculateAverageArmorClass());
      sb.append("\nAverage Attack damage: ").append(calculateAverageAttackDamage()).append("\n");
      for(Monster value : monster){
         sb.append(value);
      }
      return sb.toString();
   }
}
