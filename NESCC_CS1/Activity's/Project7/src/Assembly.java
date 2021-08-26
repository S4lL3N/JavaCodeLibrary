

import java.util.ArrayList;

public class Assembly {

    private String partNum = "";
    private ArrayList<Part> parts;

    public Assembly() {
        parts = new ArrayList<>();
    }

    public Assembly(String partNum) {
        parts = new ArrayList<>();
        this.partNum = partNum;
    }

    public void addPartToAssembly(Part part){
        parts.add(part);
    }

    public String getPartNum() {
        return partNum;
    }

    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }

    public ArrayList<Part> getParts() {
        return parts;
    }

    public void setParts(ArrayList<Part> parts) {
        this.parts = parts;
    }

    public int getTotalSurfaceArea(){
        int tempTotal = 0;
        //for(int i = 1; i < parts.size(); i++){
        for(int i = 0; i < parts.size(); i++){ //todo i changed the i=1 to i=0 **********************************************************************************
            parts.get(i).getPaintedSurfaceArea();
            tempTotal += parts.get(i).getPaintedSurfaceArea();//todo i added this to change the value of painted surface area************************************
        }
        return tempTotal;
    }

    public int getToalBuildTime() {
        int tempTotal = 0;
        for(int i = 0; i < parts.size(); i++){
            parts.get(i).calculateTotalOperationTime();
            tempTotal += parts.get(i).calculateTotalOperationTime();
        }
        return tempTotal;
    }


    @Override
    public String toString() {
        return "Assembly: " + partNum + " " + parts;
    }
}
