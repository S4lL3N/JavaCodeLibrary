package edu.northeaststate.dlblair;

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

            System.out.println("\nProduction Schedule\n");
            for(ScheduledAssembly sa : scheduledAssemblies){
                System.out.print("Assembly: " + sa.getAssembly().getPartNum());
                System.out.println(" Due Date: " + sa.getStringDate());
                System.out.print("Parts: ");
                System.out.println(sa);
                for(Part part : sa.getAssembly().getParts()){
                    System.out.print(part + " ");
                }
                System.out.print("\nTotal painted surface area: " + sa.getAssembly().getTotalSurfaceArea() + " sq/inches");
                System.out.println("\n");
            }

        } catch (FileNotFoundException | ParseException e) {
            e.printStackTrace();
        }

    }

}
