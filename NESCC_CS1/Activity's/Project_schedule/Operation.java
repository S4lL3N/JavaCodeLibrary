package edu.northeaststate.dlblair;

public class Operation {

    private String operationName;
    private int minutesInOperation;

    public Operation(String operationName, int minutesInOperation) {
        this.operationName = operationName;
        this.minutesInOperation = minutesInOperation;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public int getMinutesInOperation() {
        return minutesInOperation;
    }

    public void setMinutesInOperation(int minutesInOperation) {
        this.minutesInOperation = minutesInOperation;
    }

    @Override
    public String toString() {
        return operationName +  " " + minutesInOperation;
    }
}
