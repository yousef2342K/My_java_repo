using System;

public class Calc{
    static void Main(String[]args)
{

   Console.WriteLine("Enter first number : ");
   // Type casting from str to int 32
   int x = Convert.ToInt32(Console.ReadLine());
   Console.WriteLine("Enter second number : ");
   // Type casting from str to int 32
   int y = Convert.ToInt32(Console.ReadLine());
   int result = fnsum(x,y);
   // addition part
   Console.WriteLine($"{x} + {y} = {result}");
   result = fnsub(x,y); // the value is automatically changed .
   // subtraction part 
   Console.WriteLine($"{x} - {y} = {result}");
   result = fnmult(x,y);
   // multiplication part
   Console.WriteLine($"{x} * {y} = {result}");
   // division part
   result = fndiv(x,y);
   Console.WriteLine($"{x} / {y} = {result}");
   // modulus part
   result = fnmod(x,y);
   Console.WriteLine($"{x} % {y} = {result}"); // formatted string a bit easier than java :)
}
static int fnsum(int x , int y){ // passing by value not reference here .
    return x + y;
}
static int fnsub(int x , int y){
    return x - y;
}
static int fnmult(int x , int y){
    return x * y;
}
static int fndiv(int x , int y){
    return x / y;
}
static int fnmod(int x , int y){
    return x % y;
}
}
