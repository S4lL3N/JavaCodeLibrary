package edu.northeaststate.dlblair;

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
        for(int i = 1; i < parts.size(); i++){
            parts.get(i).getPaintedSurfaceArea();
        }
        return tempTotal;
    }

    @Override
    public String toString() {
        return "Assembly: " + partNum + " " + parts;
    }
}
