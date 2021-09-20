import javax.swing.JOptionPane;
/**
* DivisionDriver class, the driver for the division app.
*   
*
* Activity 6
* @author  Shae Allen – CPSC-1220-AO1 
* @version 9/20/21
*/
public class DivisionDriver {
/**
    * The driver for division app.
    * @param args not used.
    */
   public static void main(String[] args) {
   
      String numInput; 
      String denomInput; 
      
      numInput = JOptionPane.showInputDialog("Enter the numerator: ");
      denomInput = JOptionPane.showInputDialog("Enter the denominator: ");
      
      try {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
         
         String result = "Integer division: \n"
                       + Division.intDivide(num, denom)
                       + "\n\nFloating point division: \n"
                       + Division.decimalDivide(num, denom);
                       
         JOptionPane.showMessageDialog(null,
                           result, "Result", JOptionPane.PLAIN_MESSAGE);   
      }
      catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null,
                        "Invalid input: enter numerical integer values only.",
                        "Error", JOptionPane.ERROR_MESSAGE);
      }
      catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null, e,
                        "Error", JOptionPane.ERROR_MESSAGE);
      }
   
   }
}