public class looping_in_java{
public static void main(String[]argv){   /* CPU Time: 0.11 sec(s), Memory: 34944 kilobyte(s)

compiled and & executed in 0.874 sec(s)*/
int i,j;
for (i = 0 ; i <= 9 ; i++){
  for (j  = 0 ; j <= 9 ; j++){
      if (i == j){
        String s = "" + i + j;
        System.out.println(s);    
          break;
          }
    
          }
        }
    }
}

/*  public class looping_in_java{
public static void main(String[] args) {    /// CPU Time: 0.10 sec(s), Memory: 33408 kilobyte(s)

compiled and & executed in 0.685 sec(s)

    for (int i = 0; i <= 9; i++) {
        System.out.println(i + "" + i);
    }
}
}

*/
