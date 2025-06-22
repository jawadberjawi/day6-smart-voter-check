import java.util.Scanner; // Import the Scanner class to read input from the user

public class SmartVoterCheck { // Declare the class

    public static void main(String[] args) { // Main method: entry point of the program

        Scanner input = new Scanner(System.in); // Create Scanner object to read input

        System.out.print("Please enter your name: "); // Ask user to enter their name
        String name = input.next(); // Store the name input from the user

        System.out.print("Please enter your age: "); // Ask user to enter their age
        int age = input.nextInt(); // Store the age input as an integer

        System.out.print("Do you have Voting ID? (true or false): "); // Ask if user has a voting ID
        boolean hasId = input.nextBoolean(); // Store the boolean answer (true/false)

        if (age >= 18 && hasId) { // Check if user is 18+ and has a voting ID
            System.out.println("Hello " + name + ", you are eligible to vote!"); // Eligible case
        } else if (age >= 18 && !hasId) { // If age is enough but ID is missing
            System.out.println("Hello " + name + ", you are old enough but need a valid voting ID to vote."); // Missing ID case
        } else {
            System.out.println("Sorry " + name + ", you are not eligible to vote."); // Not eligible case
        }

    }
}
