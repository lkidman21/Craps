
/**
 * The main program of Craps
 *
 * @author Lauren Kidman
 * @version 2019-01-22
 */
import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Dice dice = new Dice();
        System.out.println("Would you like to play craps? (Y/N)");
        String answer = keyboard.nextLine();
        if(answer.substring(0,1).equalsIgnoreCase("Y"))
        {
            System.out.println("Do you need instructions? (Y/N)");
            String help = keyboard.nextLine();
            if(help.substring(0,1).equalsIgnoreCase("Y"))
            {
                System.out.println(displayInstructions());
            }
            
            System.out.println("Lets begin!");
            int point = 0;
            
            System.out.println("Press <enter> to roll:");
            String roll = keyboard.nextLine();
            System.out.println("rolling...rolling...rolling");
            dice.roll();
            int result  = dice.getRoll1() + dice.getRoll2();
            System.out.println("You rolled: " + result);
            boolean isGameRunning = true;
            if(result == 7 || result == 11)
            {
                System.out.println("Congratulations! You've won the game.");
                isGameRunning = false;
            }
            else if(result == 2 || result == 3 || result == 12)
            {
                System.out.println("Uh oh! You lost. :(");
                isGameRunning = false;
            }
            else
            {
                point = result;
                System.out.println(point + " is now your point! Try to roll it again to win!");
            }
            
            while(isGameRunning)
            {
                System.out.println("Press <enter> to roll:");
                roll = keyboard.nextLine();
                System.out.println("rolling...rolling...rolling");
                dice.roll();
                result  = dice.getRoll1() + dice.getRoll2();
                System.out.println("You rolled: " + result);
                if(result == point)
                {
                    System.out.println("Congratulations! You've rolled your point and won the game!");
                    isGameRunning = false;
                }
                else if(result == 7)
                {
                    System.out.println("Oh man, you rolled a 7...you lost!");
                    isGameRunning = false;
                }
                else
                {
                    System.out.println("Roll again!");
                }
            }
        }
        else
        {
            System.out.println("Ok. Bye :(");
        }
    }

    /**
     * Prints the instructions
     * 
     * @return String  the instructions for Craps
     */
    private static String displayInstructions()
    {
        return "Welcome to Craps! Here is how to play: \n\rA player rolls two six-sided dice and adds their values together.\n   On the first roll, if the sum of the two die equal 7 or 11, the player automatically wins the game.\n   However, if the sum of the two die equal a 2,3, or 12, the player automatically loses the game.\n\rThe number you roll first, if you do not roll any of these specified numbers, becomes your 'point.'\n\rThe player will continue rolling until 1 of 2 things occurs: The player wins the game by rolling their 'point', or they lose by rolling a 7!";
    }
}
