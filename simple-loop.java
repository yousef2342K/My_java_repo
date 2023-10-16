import java.util.Scanner;
public class simple-loop{
    public static void main(String[]argv){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        
        for (int i = 0 ; i<=num;i++){
            if (i%2== 0){
            System.out.println(i + " is even");
            }
            else{
                System.out.println(i + " is odd");
            }
        }
    }
}
