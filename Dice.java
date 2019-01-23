
/**
 * Combines two instances of the Die class into one
 *
 * @author Lauren Kidman
 * @version 2019-01-22
 */
public class Dice
{
    // instance variables
    private Die die1;
    private Die die2;
    private int[] rolls;;

    /**
     * Constructor for objects of class Dice
     */
    public Dice()
    {
        die1 = new Die();
        die2 = new Die();
        rolls = new int[2];
    }

    /**
     * Sets the values of the two die being rolled
     *
     * @return    the array of die values
     */
    public int[] roll()
    {
        rolls[0] = die1.roll();
        rolls[1] = die2.roll();
        
        return rolls;
    }
    
    /**
     * Gets the value of the first die
     * 
     * @return getRoll1  first die number
     */
    public int getRoll1()
    {
        return rolls[0];
    }
    /**
     * Gets the value of the second die
     * 
     * @return getRoll2  second die number
     */
    public int getRoll2()
    {
        return rolls[1];
    }
}
