package edu.northeaststate.dlblair;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AssemblyFileUtility {

    private static String readDataFile(String fileName) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        File file = new File(fileName);
        Scanner fin = new Scanner(file);
        while (fin.hasNextLine()) {
            sb.append(fin.nextLine());
        }
        return sb.toString();
    }

    public static ArrayList<ScheduledAssembly> parseAssemblies(String fileName) throws FileNotFoundException, ParseException {

        String input = readDataFile("assemblies.edi"); //fileName
        ArrayList<ScheduledAssembly> scheduledAssemblies = new ArrayList<>();
        String tempAssemblies[] = input.split("&");
        //5:TK1234F;PN11155,PN01102,PN01105;2020-05-05
        for (String str : tempAssemblies) {
            Assembly assembly = new Assembly();
            ScheduledAssembly sa = new ScheduledAssembly();

            String[] partNumber = str.split(";");

            String[] qtyAndPN = partNumber[0].split(":");
            sa.setQuantity(Integer.parseInt(qtyAndPN[0])); //qty
            assembly.setPartNum(qtyAndPN[1]); //assembly pn

            String[] parts = partNumber[1].split(",");
            for (int i = 0; i < parts.length; i++) {
                Part part = new Part();
                part.setPartNumber(parts[i]);
                assembly.addPartToAssembly(part); //show part
            }

            //convert string to date object
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(partNumber[2]);
            //Date date = sdf.parse(partNumber[2]);
            sa.setDueDate(date);
            sa.setAssembly(assembly);
            scheduledAssemblies.add(sa);
        }
        return scheduledAssemblies;
    }

    public static ArrayList<Part> parseParts(String fileName) throws FileNotFoundException {
        String input = readDataFile("partData.edi"); //fileName
        ArrayList<Part> parts = new ArrayList<>();
        String tempParts[] = input.split("&");
        //PN11155;145;press-15,bond-55,prep-12,paint-80,pack-5
        for (String str : tempParts) {
            Part part = new Part();
            String partInfo[] = str.split(";");
            String pn = partInfo[0];
            part.setPartNumber(pn); //pn
            String surfaceArea = partInfo[1]; //surface area

            part.setPaintedSurfaceArea(Integer.parseInt(surfaceArea));
            String[] opers = partInfo[2].split(",");
            for (String oper : opers) {
                String operDetails[] = oper.split("-");
                String operation = operDetails[0]; //oper
                String operTime = operDetails[1]; //time
                part.addOperation(operation, Integer.parseInt(operTime));
            }
            parts.add(part);
        }
        return parts;
    }

}
