/**
 * Name: Shae Allen
 * Date: 12/4/2019
 * Project: Project 7 debugging
 *
 * Find errors in the code, and change console output to meet the requested format.
 *
 * Code I changed/added:
 *                      Scheduler: line 43,    Part: line 9,    AssemblyFileUtility: line 25   Assembly: line 42,
 *                                 line 50,          line 14,                                            line 44
 *                                 line 53,          line 18
 *                                 line 56
 *                                 line 57
 */

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;

public class Scheduler {

    public static void main(String[] args) {

        try {

            ArrayList<ScheduledAssembly> scheduledAssemblies = AssemblyFileUtility.parseAssemblies("assembly.edi");
            ArrayList<Part> parts = AssemblyFileUtility.parseParts("partdata.edi");
            for(ScheduledAssembly sa : scheduledAssemblies){
                for(Part part : sa.getAssembly().getParts()){
                    String strPart  = part.getPartNumber();
                    for(Part registeredPart : parts){
                        if(registeredPart.getPartNumber().equals(strPart)){
                            part.setPaintedSurfaceArea(registeredPart.getPaintedSurfaceArea());
                            part.setOperations(registeredPart.getOperations());
                        }
                    }
                }
            }

            Collections.sort(scheduledAssemblies, new SortByDate());

            int buildTime; //todo added this for total build time**************************************************************************************************************

            System.out.println("\nProduction Schedule\n");
            for(ScheduledAssembly sa : scheduledAssemblies){
                System.out.print("Assembly: " + sa.getAssembly().getPartNum());
                System.out.println(" Due Date: " + sa.getStringDate());
                System.out.print("Parts: ");
                //System.out.println(sa); //todo I commented out to meet the requested format**********************************************************************************
                for(Part part : sa.getAssembly().getParts()){
                    //System.out.print(part + " ");
                    System.out.print(part.getPartNumber() + " ");//todo i changed this to get the format correct***************************************************************
                }
                System.out.print("\nTotal painted surface area: " + sa.getAssembly().getTotalSurfaceArea() + " sq/inches");
                buildTime = Part.calculateTotalOperationTime();//todo added this for total build time**************************************************************************
                System.out.print("\nTotal build time: " + buildTime + " minutes"); //todo added this to meet requested format**************************************************


                System.out.println("\n");

            }

        } catch (FileNotFoundException | ParseException e) {
            e.printStackTrace();
        }

    }

}
