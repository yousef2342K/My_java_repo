import java.util.Scanner;
import java.util.Arrays;
class array_sorting_one{
    public static int [] sortted_array(int [] x){
        Arrays.sort(x);
        return x;
    }
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int length_array = sc.nextInt();
        int [] my_array = new int [length_array];
        for (int i = 0 ; i<length_array; i++ ){
            System.out.printf("Enter the value number %d : \n",i+1);
            my_array[i] = sc.nextInt();
        }
    sortted_array(my_array);
    System.out.println(Arrays.toString(my_array));
    }
}
