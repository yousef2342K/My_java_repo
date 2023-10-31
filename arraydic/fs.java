import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        // scanner part
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the array  :");
        int len = sc.nextInt();
        // declare an array
        int[] myArray1 = new int[len];
        // for loop to add values to the array
        for (int j = 0; j < len; j++) {
            System.out.printf("Enter the value number %d\n", j + 1);
            myArray1[j] = sc.nextInt();
        }
        // the checked number
        System.out.println("The number you want to check if it is in the array or not");
        int search = sc.nextInt();

        if (myArray1.length == 0) {
            System.out.printf("number %d is not found", search);
            return;
        }

        int i = 0;
        while (i < myArray1.length && search != myArray1[i]) {
            i++;
        }

        if (i < myArray1.length) {
            System.out.printf("number %d is found", search);
        } else {
            System.out.printf("number %d is not found", search);
        }
    }
}
