/**
 * Name: Shae Allen
 * Date: 12/11/2019
 * Project: Final Exam
 */
import java.util.ArrayList;
import java.util.Scanner;

public class MotorInventory {
    public static void main(String[] args){
        ArrayList<Motor> motors = new ArrayList<>();
        Scanner cin = new Scanner(System.in);

        String model; 
        String torqueAndRPM;
        String[] specs;
        String input;
        int torque = 0;
        int rpm = 0;
        int counter = 0;
        double totalHP = 0.0;

        while(true) {

            System.out.print("Enter a model: ");
            model = cin.nextLine();
//======================================================================================================================

            //System.out.print("Enter torque in ft/lbs at some RPM (ex:420 4600): ");
            //torqueAndRPM = "";
            try {
                System.out.print("Enter torque in ft/lbs at some RPM (ex:420 4600): ");
                torqueAndRPM = cin.nextLine();
                specs = torqueAndRPM.split(" ");
                torque = Integer.parseInt(specs[0]);
                rpm = Integer.parseInt(specs[1]);
            }catch (IndexOutOfBoundsException e){
                System.out.println("Please enter Torque and RPM values separated by a space.");
                System.out.print("Enter torque in ft/lbs at some RPM (ex:420 4600): ");
                torqueAndRPM = cin.nextLine();
                specs = torqueAndRPM.split(" ");
                torque = Integer.parseInt(specs[0]);
                rpm = Integer.parseInt(specs[1]);
                //totalHP += motors.get(counter).getHorsePower();
            }catch(NumberFormatException e){
                System.out.print("Not  valid Torque/RPM input, try again.\n");
                System.out.print("Enter torque in ft/lbs at some RPM (ex:420 4600): ");
                torqueAndRPM = cin.nextLine();
                specs = torqueAndRPM.split(" ");
                torque = Integer.parseInt(specs[0]);
                rpm = Integer.parseInt(specs[1]);

            }
            motors.add(new Motor(model,torque,rpm));
            //motors.get(counter).getHorsePower();
            try {
                totalHP += motors.get(counter).getHorsePower();
            }catch (Exception e) {

            }

            /*
            Motor engine = new Motor(model,torque, rpm);
            engine.setModel(model);
            engine.setRpm(rpm);
            engine.setFootPoundsOfTorque(torque);
            engine.getHorsePower();
            motors.add(engine);
            //System.out.println("model= " + model + " torque= " + torque + " RPM= " + rpm);
            */

            System.out.print("Another motor? (y/n): ");
            input =cin.nextLine();

            if (input.equalsIgnoreCase("y")){
                counter += 1;
                continue;
            }else{
                break;
            }//end if/else statement
        }//end while loop


        System.out.printf("\n%55s","Motor Inventory");
        System.out.printf("\n%55s","---------------");
        System.out.printf("\n%20s%20s%20s%20s","Model", "HP","Torque","RPM");
        System.out.printf("\n%20s%20s%20s%20s","-----", "--","------","---");
        for (int i = 0; i < motors.size();i++){
            System.out.printf("\n%20s%20.2f%20d%20d",motors.get(i).getModel(),motors.get(i).getHorsePower(),motors.get(i).getFootPoundsOfTorque(),motors.get(i).getRpm());
        }
        System.out.printf("\n%40s","------");
        System.out.printf("\n%20s%20.2f","Average HP:", calculateAverageHP(counter, totalHP));
        //System.out.println(motors);

    }//end main

    public static Double calculateAverageHP(int counter, double totalHP){
        double averageHorsePower = 0.0;
        averageHorsePower = totalHP / (counter + 1);
        //System.out.println(averageHorsePower);
        return averageHorsePower;
    }//end calculateAverageHP method

}//end class
