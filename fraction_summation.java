import java.util.Scanner;
public class Main{
    public static void main(String[]args){
    /// Scanner part
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter the number needed to calculate up to it");
    int up_to_num = sc.nextInt();
    // calling the method
    System.out.println("the result is " + Summation_fractions(up_to_num));
    }
    
    public static double Summation_fractions(int n)
    {
        double recop = 0;
        for (int i = 1 ; i <= n;i++){
          recop += Math.pow(-1,i+1) / factorial(i);
        }
    
    return recop;
    }
    public static int factorial(int y){
       int return_value = 1;
       for (int j = 1 ; j <= y ; j++){
         return_value *=j;
    }
    return return_value;
       
   }
}
