
class RandomNumbers
{
  public static void main (String[] args)
  {
    System.out.println("What would you like the first number of your range to be?");
    double first = In.getDouble();
    System.out.println("What would you like the last number of your range to be?");
    double last = In.getDouble();
    System.out.println("Specify the integer step of your range.");
    int step = In.getInt();
    double random = first+(int)(Math.random()*(((last - first)/step)+ 1))* step;
    System.out.println("___________________________________________________");
    System.out.println();
    System.out.println("Your Randomly Generated Number is: " + random + ".");
    System.out.println("___________________________________________________");
  }
}

