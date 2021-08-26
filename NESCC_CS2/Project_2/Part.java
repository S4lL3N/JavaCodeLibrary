package ProjectTwo;
/**
 *
 * Purpose: Part class, creates part objects.
 * - Overloaded constructor
 * - Getter methods: getPartNumber, getSerialNumber, getWeight, getSurfaceArea
 * - Setter methods: setPartNumber, setSerialNumber, setWeight, setSurfaceArea
 * - Public methods: toString
 */

public class Part {
    private String partNumber;
    private String serialNumber;
    private int weight;
    private double surfaceArea;

    public Part(String partNumber, String serialNumber, int weight, double surfaceArea) {
        this.partNumber = partNumber;
        this.serialNumber = serialNumber;
        this.weight = weight;
        this.surfaceArea = surfaceArea;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(Double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Part: ");
        sb.append("[name=").append(partNumber);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", weight=").append(weight);
        sb.append(", sufaceArea=").append(surfaceArea).append("]\n");
        return sb.toString();
    }
}
