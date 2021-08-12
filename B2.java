class B2 
{
 public static void main (String[] args)
 {
   System.out.println ("What is your first number");
   int number1 = In.getInt();
   System.out.println ("What is your second number");
   int number2 = In.getInt();
   System.out.println ("What is your third number");
   int number3 = In.getInt();
   if ((number1 > number2) && (number2 > number1))
   {
     System.out.println("The first number is the largest");
   }
   else if ((number2 > number3) && (number2>number1))
   {
     System.out.println("The second number is the largest");
   }
   else 
   {
     System.out.println("The third number is the largest");
   }
 }
}