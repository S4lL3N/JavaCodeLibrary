/*
 * Name: Shae Allen
 * Course: CISP-1020-A70
 * Date: 3/24/2020
 * Project: Manufacturing Part Assembly Manager(Project 2)
 */
package ProjectTwo;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * Purpose: AssemblyDriver class, runs the main method.
 * - Constructor: N/A
 * - Getter methods: N/A
 * - Setter methods: N/A
 * - Public methods: main
 */
public class AssemblyDriver {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String input;
        ArrayList<Assembly> assemblies = new ArrayList<>();
        String partNumber;
        String serialNumber;
        int weight;
        double surfaceArea;
        boolean assemblyPrompt = true;
        boolean partPrompt = true;

        while(assemblyPrompt){
            System.out.print("Enter the assembly number you would like to build (D if done): ");
            input = cin.nextLine();

            if(input.equalsIgnoreCase("d")){
                assemblyPrompt = false;
            }else {

                Assembly assembly = new Assembly(input);

                while(partPrompt){
                    System.out.print("\nAdd Parts:\n");
                    System.out.print("Part number:");
                    partNumber = cin.nextLine();
                    System.out.print("Serial number:");
                    serialNumber = cin.nextLine();
                    do{
                        System.out.print("Part weight:");
                        input = cin.nextLine();
                        weight = Helper.isPositiveInteger(input);
                        if (weight == -1) {
                            System.out.println("Invalid weight, must be a positive integer. Try again.");
                        } else {
                            weight = Integer.parseInt(input);
                        }
                    }while(weight == -1);

                    do{
                        System.out.print("Part surface area:");
                        input = cin.nextLine();
                        surfaceArea = Helper.isPositiveDouble(input);
                        if( surfaceArea == -1.0){
                            System.out.println("Invalid surface area, must be a positive floating point value. Try again.");
                        }else {
                            surfaceArea = Double.parseDouble(input);
                        }
                    }while(surfaceArea == -1.0);

                    assembly.addPartToAssembly(partNumber,serialNumber,weight,surfaceArea);

                    System.out.print("\nAdd another part to this assembly? (Y or N): ");
                    input = cin.nextLine();
                    if(input.equalsIgnoreCase("n")){
                        System.out.println();
                        partPrompt = false;
                    }

                }

                assemblies.add(assembly);
            }

            partPrompt = true;

        }

        System.out.print("\nAssembly Report\n===================================================\n");
        assemblies.forEach(System.out::println);
    }
}
