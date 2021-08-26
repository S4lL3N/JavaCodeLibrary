import java.util.Scanner;

public class Motor {

    //variables
    private String model;
    private Double horsePower;
    private int footPoundsOfTorque;
    private int rpm;

    public Motor(String model, int footPoundsOfTorque, int rpm){
            this.model = model;
            this.footPoundsOfTorque = footPoundsOfTorque;
            this.rpm = rpm;

    }//end motor

    private void calculateHorsePower(int footPoundsOfTorque, int rpm)throws InvalidTorqueException, InvalidRPMException{
        try {
            if (footPoundsOfTorque == 0){
                throw new InvalidTorqueException("Torque must be greater than 0.");
            }
            if (rpm == 0){
                throw new InvalidRPMException("RPM must be greater than 0.");
            }
            //Formula-  HP = (torque x RPM) / 5252
            horsePower = (footPoundsOfTorque * rpm) / 5252.0;
        }catch (InvalidTorqueException | InvalidRPMException err){
            Scanner cin = new Scanner(System.in);
            String torqueAndRPM;
            String[] specs;
            System.out.print("Enter torque in ft/lbs at some RPM (ex:420 4600): ");
            torqueAndRPM = cin.nextLine();
            specs = torqueAndRPM.split(" ");
            this.footPoundsOfTorque = Integer.parseInt(specs[0]);
            this.rpm = Integer.parseInt(specs[1]);
            horsePower = (footPoundsOfTorque * rpm) / 5252.0;

        }
    }//end calculateHorsePower

    //Getters and Setters===============================================================================================
    public String getModel() {
        return model;
    }
/*
    public void setModel(String model) {
        this.model = model;
    }
*/
    public Double getHorsePower() {
        try {
            calculateHorsePower(footPoundsOfTorque, rpm);
            return horsePower;
        } catch (InvalidTorqueException | InvalidRPMException err) {
            Scanner cin = new Scanner(System.in);
            String torqueAndRPM;
            String[] specs;
            System.out.print("Enter torque in ft/lbs at some RPM (ex:420 4600): ");
            torqueAndRPM = cin.nextLine();
            specs = torqueAndRPM.split(" ");
            footPoundsOfTorque = Integer.parseInt(specs[0]);
            rpm = Integer.parseInt(specs[1]);
            //calculateHorsePower(footPoundsOfTorque,rpm);
        }
        return horsePower;
    }
    public int getFootPoundsOfTorque() {
        return footPoundsOfTorque;
    }

    public void setFootPoundsOfTorque(int footPoundsOfTorque) {
        this.footPoundsOfTorque = footPoundsOfTorque;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "model = " + model + ", " +
                ", Horse Power = " + horsePower + ", " +
                ", Torque = " + footPoundsOfTorque + ", " +
                ", RPM = " + rpm + ", " +
                '}';
    }
}//end class
