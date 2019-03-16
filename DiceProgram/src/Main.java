import java.util.Scanner; //Class for receiving user input.
import java.util.Random; //Class for random number generation.
public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in); //Initialization of user input receiver.
        Random rand = new Random();  //Initialization of random number generator
        int i = 0, rollTotal = 0; //Initialization of variables used inside the while loop.

        System.out.println("How many sides would you like to roll?");
        int sides = keyboard.nextInt(); //Stores user input integer for the number of sides on the die.
        System.out.println("How many dice would you like to roll?");
        int rolls = keyboard.nextInt(); //Stores user input integer for the number of die to roll.

        while (i < rolls) {

            int randNum = rand.nextInt(sides); //Generates a random number between 0 and the number of sides -1.
            System.out.println("Roll number " + (i+1) + " = " + (randNum+1) ); //Prints the roll number and and the number of the dice face.
            rollTotal += (randNum+1); //Adds the number generated for the loop to the total count to be output at the end.
            i++; //Increments the variable 'i' by 1.

        }

        System.out.println(rollTotal); //Prints the total count of the dice rolls.

        }

    }

