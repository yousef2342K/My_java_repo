import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of retries: ");
        int retries = scanner.nextInt();

        // Declare the array with a size
        int[] myArray = new int[retries];

        // Iterate over the number of retries
        for (int i = 0; i < retries; i++) {
            System.out.println("Enter the array element: ");

            // Check for invalid user input
            int element;
            try {
                element = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer value.");
                break;
            }

            myArray[i] = element;
        }

        // Import the Arrays class and print the array to the console
        System.out.println("The array is: " + Arrays.toString(myArray));

        // Close the Scanner object
        scanner.close();
    }
}

