

import java.util.ArrayList;

public class Part {

    private String partNumber = "";
    private double paintedSurfaceArea = 0.0;
    private static ArrayList<Operation> operations = new ArrayList<>(); //todo Changed this to static************************************************************

    public Part() {
    }

    public static int calculateTotalOperationTime(){ //todo Changed this to static*******************************************************************************
        int tempTime = 0;
        for(Operation oper : operations){
            oper.getMinutesInOperation();
            tempTime += oper.getMinutesInOperation(); //todo added this to calculate the total time *************************************************************
        }
        return tempTime;
    }

    public Part(String partNumber, double paintedSurfaceArea) {
        this.partNumber = partNumber;
        this.paintedSurfaceArea = paintedSurfaceArea;
    }

    public void addOperation(String name, int min){
        operations.add(new Operation(name, min));
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPaintedSurfaceArea(double paintedSurfaceArea) {
        this.paintedSurfaceArea = paintedSurfaceArea;
    }

    public void setOperations(ArrayList<Operation> operations) {
        this.operations = operations;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public double getPaintedSurfaceArea() {
        return paintedSurfaceArea;
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    @Override
    public String toString() {
        return partNumber + " paintedSurfaceArea " + paintedSurfaceArea + ", operations=" + operations;
    }
}
