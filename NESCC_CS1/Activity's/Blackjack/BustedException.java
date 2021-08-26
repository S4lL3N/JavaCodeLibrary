package edu.northeaststate.sallen14;

public class BustedException extends Exception {
    //local variable
    int value;
    //_________PROCESS______________________________________
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    public BustedException(String message, int value){
        super(message);
        this.value = value;
    }//end BustedException method
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    public int getValue() {
        return value;
    }
}//end class
