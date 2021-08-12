class MyMarks 
{
  public static void main(String[] args) 
  { 
   System.out.println("Tell me your first mark."); 
   double mark1 = In.getDouble();
   System.out.println("My first mark is " + mark1);
   System.out.println("Tell me your second mark."); 
   double mark2 = In.getDouble();
   System.out.println("My second mark is " + mark2);
   double markTotal = (mark1 + mark2);
   System.out.println("Your total mark so far is " + markTotal); 
   System.out.println("Tell me your third mark."); 
   double mark3 = In.getDouble();
   System.out.println("My third mark is " + mark3);
   System.out.println("Tell me your fourth mark."); 
   double mark4 = In.getDouble();
   System.out.println("My fourth mark is " + mark4);
   markTotal = (markTotal + mark3 + mark4);
   System.out.println("My mark total is " + markTotal);
   double average = (markTotal/4);
   System.out.println("My average is " + average);
  }
}


