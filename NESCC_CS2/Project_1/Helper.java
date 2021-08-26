package ProjectOne;
/**
 *
 * Purpose: Helper class, the island for misfit methods.
 * - default constructor
 * - Getter methods: N/A
 * - Setter methods: N/A
 * - Public methods: isPositiveInteger
 */
public class Helper {
    //constructor
    public Helper() {
    }
    /**
     *  Method description: This method checks for positive integers
     *  Parameters: int value
     *  Return: isPositive
     */
    public static boolean isPositiveInteger(String value) {
        boolean isPositive = true;
        int temp = 0;
        temp = Integer.parseInt(value);
        if (temp < 0) {
            isPositive = false;
            System.out.println("***Invalid Integer***\nPlease Try Again");
        }
        return isPositive;

    }
}