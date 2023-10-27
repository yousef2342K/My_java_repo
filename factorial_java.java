import java.util.*;

public class factorial_java {
    // factorial method
    public static int factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }
    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number u want to calculate its factorial : ");
        int result = sc.nextInt();
        // codition and this is optional
        if (result > 15) {
            System.out.println("This is huge number to calculate plz choose from 1 to 15 !! ");
            System.exit(1);
        }
        // some formatted string to make it more readable
        System.out.printf("The factorial of %d is %d\n", result, factorial(result));
    }
}
