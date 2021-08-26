/**
 * -------------------------------------------------
 * File name: Warg.java
 * Project name: Random Encounters
 * -------------------------------------------------
 * Creator's name: Shae Allen
 * Email: sallen14@nstumail.northeaststate.edu
 * Course and section: 1020 A70
 * Creation date: Apr 9, 2020
 * -------------------------------------------------
 */
package ProjectThree.Monsters;
import ProjectThree.Utilities.SimpleDiceRoller;
/**
 * <b>
 * Purpose: Warg extends Monster and describes a special case of Monster.
 *          See monsters for inherited methods and attributes.
 * - Default constructor and parameterized constructor
 * - Public methods: toString
 * </b>
 * <hr>
 * Date created: Apr 9, 2020
 * <hr>
 * @author Shae Allen
 */
public class Warg extends Monster {
    private static int numWargs = 1;
    private static final int WARG_MAX_HP = 100;

    /**
     * Method description: Default constructor, creates a name using using string literal "Warg " and appends the numBalrogs
     * static attribute. Also uses SimpleDiceRoller to generate a number between 1 and WARG_MAX_HP.
     * Calls parent constructor using super(). Increments the static variable numWargs to count
     * total number of Wargs created.
     * Date: Apr 9, 2020
     * Parameters: String name
     * Return type: NA
     */
    public Warg() {
        super("Warg " + numWargs, SimpleDiceRoller.roll(WARG_MAX_HP));
        numWargs += 1;
    }

    /**
     * Method description: Parameterized constructor, takes a String name input and uses SimpleDiceRoller to generate
     * a number between 1 and WARG_MAX_HP. Calls parent constructor using super(). Increments
     * the static variable numWargs to count total number of Wargs created
     * Date: Apr 9, 2020
     * Parameters: String name
     * Return type: NA
     */
    public Warg(String name) {
        super(name, SimpleDiceRoller.roll(WARG_MAX_HP));
        numWargs += 1;
    }

    /**
     * Method description: Build a string that represents an Warg
     * Date: Apr 9, 2020
     * Parameters: none
     * Return type: String
     */
    @Override
    public String toString() {
        return "Warg [name=" +
                this.name +
                ", hitPoints=" +
                this.hitPoints +
                "]";
    }
}