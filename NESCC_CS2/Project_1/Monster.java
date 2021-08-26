package ProjectOne;
/**
 *
 * Purpose: Monster class, create monster object for encounter.
 * - Overloaded constructor
 * - Getter methods: getName, getHitPoints, getArmorClass, getAttackDamage
 * - Setter methods: setName, setHitPoints, setArmorClass, setAttackDamage
 * - Public methods: toString
 */

public class Monster {
    //variables
    private String name;
    private int hitPoints;
    private int armorClass;
    private int attackDamage;


    //Constructor
    public Monster(String name, int hitPoints, int armorClass, int attackDamage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.armorClass = armorClass;
        this.attackDamage = attackDamage;

    }
    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monster: ");
        sb.append("{name=").append(name);
        sb.append(", hitPoints=").append(hitPoints);
        sb.append(", armorClass=").append(armorClass);
        sb.append(", attackDamage=").append(attackDamage).append("}\n");
        return sb.toString();

    }
}