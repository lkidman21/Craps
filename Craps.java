
/**
 * Write a description of class Craps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Would you like to play craps? (Y/N)");
        String answer = keyboard.nextLine();
        if(answer.equalsIgnoreCase("Y") ||answer.equalsIgnoreCase("Yes"))
        {
            System.out.println("Do you need instructions? (Y/N)");
            String help = keyboard.nextLine();
            if(help.equalsIgnoreCase("Y") || help.equalsIgnoreCase("Yes"))
            {
                System.out.println(displayInstructions());
            }
            
        }
            
        
        
    }
    
    private static String displayInstructions()
    {
        return "Welcome to Craps! Here is how to play: \nA player rolls two six-sided dice and adds their values together.\n    On the first roll, if the sum of the two";
        
    }
}
