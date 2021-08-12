class A2
{
  public static void main(String[] args)
  {
    System.out.println("Enter your first number");
    int number1 = In.getInt();
    System.out.println("Enter your second number");
    int number2 = In.getInt();
    if (number1>number2) 
    {
      System.out.println("The greater number is " + number1);
    }
    else if (number2>number1)
    {
      System.out.println ("The greater number is " + number2);
    }          
}
}
