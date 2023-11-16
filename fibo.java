import java.util.Scanner;
// just to generate fibos numbers
class fibo {
    public static void fabio(int num) {
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 2; i < num; i++) {
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of numbers: ");
        int range = sc.nextInt();
        System.out.printf("The Fibonacci numbers in the range " + range + " are: ");
        fabio(range);
    }
}
