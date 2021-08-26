/**
 * -------------------------------------------------
 * File name: Balrog.java
 * Project name: Monster Lab
 * -------------------------------------------------
 * Creator's name: Shae Allen
 * Email: sallen14@nstumail.northeaststate.edu
 * Course and section: 1020 A70
 * Creation date: Apr 9, 2020
 * -------------------------------------------------
 */
package ProjectFour.monsterlab.models;
import ProjectFour.util.SimpleDiceRoller;
import java.io.Serializable;

/**
 * <b>
 * Purpose: Balrog extends Monster and describes a special case of Monster.
 *          See monsters for inherited methods and attributes.
 * - Default constructor and parameterized constructor
 * - Public methods: toString
 * </b>
 * <hr>
 * Date created: Apr 9, 2020
 * <hr>
 * @author Shae Allen
 */
public class Balrog extends Monster implements Serializable {
    private static int numBalrogs = 1;
    private static final int BALROG_MAX_HP = 100;
    private static final int BALROG_ATTACK_DAMAGE = 50;
    private static final int BALROG_ARMOR_CLASS = 50;
    /**
     * Method description: Default constructor, creates a name using using string literal "Balrog " and appends the numBalrogs
     *                     static attribute. Also uses SimpleDiceRoller to generate a number between 1 and BALROG_MAX_HP.
     *                     Calls parent constructor using super(). Increments the static variable numBalrogs to count
     *                     total number of Balrogs created.
     * Date: Apr 9, 2020
     * Parameters: String name
     * Return type: NA
     */
    public Balrog() {
        super("Balrog " + numBalrogs, SimpleDiceRoller.roll(BALROG_MAX_HP),BALROG_ATTACK_DAMAGE,BALROG_ARMOR_CLASS);
        numBalrogs += 1;

    }
    /**
     * Method description: Build a string that represents an Balrog
     * Date: Apr 25, 2020
     * Parameters: none
     * Return type: String
     */
    @Override
    public String toString() {
        return "Balrog{} " + super.toString();
    }
}
