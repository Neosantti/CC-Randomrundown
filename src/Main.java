import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        // Define the range
        int range = 100 - 1 + 1;
        Scanner myObj = new Scanner(System.in);
        String accept;

        do {
            // Generate a random number
            int rand = (int) (Math.random() * range) + 1;
            System.out.println("Random number: " + rand);

            // Ask the user for input
            System.out.print("Enter 'q' to stop or anything else to get another number: ");
            accept = myObj.nextLine();

        } while (!accept.equals("q"));

        System.out.println("Thank you <3");
        myObj.close();
    }
}
