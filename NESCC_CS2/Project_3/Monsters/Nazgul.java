/**
 * -------------------------------------------------
 * File name: Nazgul.java
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
 * Purpose: Nazgul extends Monster and describes a special case of Monster.
 *          See monsters for inherited methods and attributes.
 * - Default constructor and parameterized constructor
 * - Public methods: toString
 * </b>
 * <hr>
 * Date created: Apr 9, 2020
 * <hr>
 * @author Shae Allen
 */
public class Nazgul extends Monster {
    private static int numNazguls = 1;
    private static final int NAZGUL_MAX_HP = 100;

    /**
     * Method description: Default constructor, creates a name using using string literal "Nazgûl " and appends the numNazguls
     * static attribute. Also uses SimpleDiceRoller to generate a number between 1 and NAZGUL_MAX_HP.
     * Calls parent constructor using super(). Increments the static variable numNazguls to count
     * total number of Nazguls created.
     * Date: Apr 9, 2020
     * Parameters: String name
     * Return type: NA
     */
    public Nazgul() {
        super("Nazgûl " + numNazguls, SimpleDiceRoller.roll(NAZGUL_MAX_HP));
        numNazguls += 1;
    }

    /**
     * Method description: Parameterized constructor, takes a String name input and uses SimpleDiceRoller to generate
     * a number between 1 and BALROG_MAX_HP. Calls parent constructor using super(). Increments
     * the static variable numBalrogs to count total number of Balrogs created
     * Date: Apr 9, 2020
     * Parameters: String name
     * Return type: NA
     */
    public Nazgul(String name) {
        super(name, SimpleDiceRoller.roll(NAZGUL_MAX_HP));
        numNazguls += 1;
    }

    /**
     * Method description: Build a string that represents an Balrog
     * Date: Apr 9, 2020
     * Parameters: none
     * Return type: String
     */
    @Override
    public String toString() {
        return "Nazgûl [name=" +
                this.name +
                ", hitPoints=" +
                this.hitPoints +
                "]";
    }
}