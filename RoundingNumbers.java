class RoundingNumbers 
{
  public static void main(String[] args) 
  {
     System.out.printf("Enter a number with decimals");
     double deci = In.getDouble();
     System.out.println("How many places would you like to round it to?");
     int places = In.getInt();
     System.out.printf("Your number rounded to " + places + " decimal places is ");
     System.out.printf("%."+ places + "f %n", deci);
  }
}
