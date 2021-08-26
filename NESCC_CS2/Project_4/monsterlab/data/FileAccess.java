/**
 * -------------------------------------------------
 * File name: FileAccess.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Shae Allen
 * Course: CISP 1020
 * Creation date: Apr 19, 2020
 * Edited By Shae Allen on 4/25/20
 * -------------------------------------------------
 */
package ProjectFour.monsterlab.data;

import ProjectFour.monsterlab.models.Encounter;

import java.io.*;

public class FileAccess {
   private String filename;

   public FileAccess(String filename) {
      this.filename = filename;
   }
   /**
    *  Method description: This method loads an Encounter from a file.
    *  Parameters: Encounter
    *  Throws: IOException, ClassNotFoundException
    *  Return: N/A
    */
   public void openEncounterFile(Encounter encounter) throws IOException, ClassNotFoundException{
      ObjectInputStream input = null;
      input = new ObjectInputStream(new FileInputStream(this.filename));
      Encounter temp = (Encounter) input.readObject();
      encounter.setMonsters(temp.getMonsters());
      System.out.println("\nFile Loaded successfully");
   
      input.close();
   
   }
   /**
    *  Method description: This method saves an Encounter to a file.
    *  Parameters: Encounter
    *  Throws: IOException
    *  Return: N/A
    */
   public void saveEncounterFile(Encounter encounter) throws IOException{
      File file = new File(this.filename);
      ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file.getAbsolutePath()));
      output.writeObject(encounter);
      System.out.println("\nFile saved to: " + file.getAbsolutePath());
      output.close();
   
   }

}