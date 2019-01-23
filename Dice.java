
/**
 * Write a description of class Dice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dice
{
    // instance variables - replace the example below with your own
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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int[] roll()
    {
        rolls[0] = die1.roll();
        rolls[1] = die2.roll();
        
        return rolls;
    }
    public int getRoll1()
    {
        return rolls[0];
    }
    public int getRoll2()
    {
        return rolls[1];
    }
}
