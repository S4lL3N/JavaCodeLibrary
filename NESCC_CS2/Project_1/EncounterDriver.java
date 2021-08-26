/*
 * Name: Shae Allen
 * Course: CISP-1020-A70
 * Date: 2/27/2020
 * Project: Dungeons And Dragons Encounter(Project 1)
 * UML Link- https://www.lucidchart.com/invitations/accept/0cd7c6ea-f647-4e39-b9ba-b0ce8db3362b
 */
package ProjectOne;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * Purpose: EncounterDriver class, runs the main method.
 * - Constructor: N/A
 * - Getter methods: N/A
 * - Setter methods: N/A
 * - Public methods: main
 */
public class EncounterDriver {
    /*
     * Method description: the main method, prompts user for encounter and monster data.
     * parameters: N/A
     * Return: N/A
     */
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String input;
        String name;
        int hitPoints;
        int armorClass;
        int attackDamage;

        ArrayList<Encounter> encounters = new ArrayList<>();

        while(true){
            System.out.print("Enter a name for the Encounter ( D if Done): ");
            input = cin.nextLine();

            if(input.equalsIgnoreCase("d") || input.equalsIgnoreCase("done")){
                break;
            }

            Encounter encounter = new Encounter(input);

            System.out.print("\nAdd Monsters:\n");

            while(true){
                System.out.print("\nMonster Name:");
                name = cin.nextLine();

                try{
                    System.out.print("Hit Points:");
                    input = cin.nextLine();
                    if(Helper.isPositiveInteger(input)){
                        hitPoints = Integer.parseInt(input);
                    }else {
                        continue;
                    }
                    System.out.print("Armor Class:");
                    input = cin.nextLine();
                    if(Helper.isPositiveInteger(input)){
                        armorClass = Integer.parseInt(input);
                    }else {
                        continue;
                    }
                    System.out.print("Attack Damage:");
                    input = cin.nextLine();
                    if(Helper.isPositiveInteger(input)){
                        attackDamage = Integer.parseInt(input);
                    }else {
                        continue;
                    }
                }catch (Exception e){
                    System.out.println("***Error***\nPlease Try Again");
                    continue;
                }//end try-catch

                encounter.addMonsterToEncounter(name,hitPoints,armorClass,attackDamage);

                System.out.print("\nAdd another monster to this encounter? (Y or N): ");
                input = cin.nextLine();
                if(input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no")){
                    System.out.println();
                    break;
                }//end if statement
            }//end nested while loop

            encounters.add(encounter);

        }//end while loop

        System.out.print("\nEncounter Report\n===================================================\n");
        encounters.forEach(System.out::println);

    }//end main
}//end class
