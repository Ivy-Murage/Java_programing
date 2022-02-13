package Question2;
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        //Generates random numbers bewteen 0 and 30
        Random random = new Random();
        int random_num = random.nextInt(30);
        System.out.println(random_num);

        int count = 0;
        while(true)
        {
            //Prompts user to enter a random number between 0 and 30
            System.out.println("Enter a number between 0 and 30: ");
            int num = userInput.nextInt();
            //Counts the number of times a user guesses the number until the number is similar to the random number generated
            count++;
            //Checks whether the input number is similar to the random number generated
            if (random_num == num) {
                System.out.println("Matching");
                System.out.println("Found after " +count + " trials");
                break;
            } else if (num > random_num) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again.");
            }

        }

    }
}
