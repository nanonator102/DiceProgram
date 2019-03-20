import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner; //Class for receiving user input.
import java.util.Random; //Class for random number generation.
public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in); //Initialization of user input receiver.
        Random rand = new Random();  //Initialization of random number generator
        int i = 0, rollTotal = 0; //Initialization of variables used inside the while loop.

        System.out.print("Would you like to save the results to a text file(1) or print them in the console(2)? ");
        int saveFile = keyboard.nextInt();

        while(saveFile < 1 || saveFile > 2) //Ensures that saveFile is only 1 or 2,
        {
                System.out.print("Please enter either 1 or 2.");
                saveFile = keyboard.nextInt();
        }

        System.out.print("How many sides would you like to roll? ");
        int sides = keyboard.nextInt(); //Stores user input integer for the number of sides on the die.
        System.out.print("How many dice would you like to roll? ");
        int rolls = keyboard.nextInt(); //Stores user input integer for the number of die to roll.
        String rollCollector[] = new String[rolls];

        while (i < rolls) {

            i++; //Increments the variable 'i' by 1.
            int randNum = rand.nextInt(sides); //Generates a random number between 0 and the number of sides -1 E.g. if sides = 5 then randNum = 0 to 4
            randNum++;
            if(saveFile==2) {
                System.out.println("Roll number " + (i) + " = " + randNum ); //Prints the roll number and and the number of the dice face.
            }
            rollTotal += (randNum); //Adds the number generated for the loop to the total count to be output at the end.
            rollCollector[i-1] = ("Roll number " + (i) + " = " + randNum);

        }

        i=0;
        String rollTotalPrint = ("Total roll count = " + rollTotal);
        if(saveFile==2) {
            System.out.println(rollTotalPrint); //Prints the total count of the dice rolls.
        }
            if (saveFile == 1) {
                try {
                    PrintWriter writer = new PrintWriter("Dice.txt");
                    for(i=0; i < rolls; i++) {
                        writer.println(rollCollector[i]);
                    }
                    writer.println(rollTotalPrint);
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        keyboard.close();
            if(saveFile==1) {
                System.out.println("Program executed successfully. Wrote " + rollCollector.length + " rolls to Dice.txt");
            }

        }

    }

