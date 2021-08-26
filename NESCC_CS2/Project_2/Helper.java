package ProjectTwo;
/**
 *
 * Purpose: Helper class, the island for misfit methods.
 * - default constructor
 * - Getter methods: N/A
 * - Setter methods: N/A
 * - Public methods: isPositiveInteger, isPositiveDouble
 */
public class Helper {

    public Helper() {
    }

    /**
     *  Method description: This method checks for positive integers
     *  Parameters: String value
     *  Return: x
     */
    public static int isPositiveInteger(String value) {
            int x;
            try {
                x = Integer.parseInt(value);
                if (x < 1) {
                    x = -1;
                }
            } catch (Exception e) {
                x = -1;
            }
            return x;
        }
    /**
     *  Method description: This method checks for positive double.
     *  Parameters: String value
     *  Return: x
     */
        public static double isPositiveDouble(String value) {
            double x;
            try {
                x = Double.parseDouble(value);
                if (!(x > 0.0)) {
                    x = -1.0;
                }
            } catch (Exception e) {
                x = -1.0;
            }
            return x;
        }

}
