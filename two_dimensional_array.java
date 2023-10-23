class two_dimensional_array {
    public static void main(String[] args) {
    int[][] my_array = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
    for (int i  = 0; i < my_array.length ; i++){
        for (int j = 0 ; j < my_array[i].length ; j++){
            if (i == j){
                System.out.println(my_array[i][j]);
            }
        }
    }
    // different way but a bit easier
    // for (int i = 0; i< my_array.length ; i++){
    //     System.out.println(my_array[i][i]);
    //     }
        
    }
    
}
