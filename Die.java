
/**
 * Creates a die that rolls a random integer when called
 *
 * @author Lauren Kidman
 * @version 2019-01-22
 */
public class Die
{
    // instance variables
    private int roll;
    
    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        roll = roll();
    }

    /**
     * Sets the die with a random value between 1 and 6
     *
     * @return roll  the random integer "rolled" and assigned to the die
     */
    public int roll()
    {
        roll = (int) ((Math.random() * 6) + 1);
        return roll;
    }
}
