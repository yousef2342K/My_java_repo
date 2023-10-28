public class linear__search{
    public static int linear_search(int [] array , int query){
        for (int index = 0 ; index <= array.length - 1 ; index++){
            if (array[index] == query){
            return array[index];
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int [] my_array = {5,6,4,8,2} ;
        int search_value = 4;
        int result = linear_search(my_array,search_value);
        if (result == -1){
            System.out.println(String.format("The element %d does not exist in the array",search_value));
        }
        else{
            System.out.println(String.format("The element %d exists in the array",search_value));
        }
        
    }
}
