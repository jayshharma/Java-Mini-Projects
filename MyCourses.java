class MyCourses 
{
  public static void main (String[] args)
  {
    System.out.println("What is your Math Mark? ");
    int numberOne = In.getInt();
    System.out.println("What is your Science Mark? ");
    int numberTwo = In.getInt();
    System.out.println("What is your English Mark? ");
    int numberThree = In.getInt();
    System.out.println("What is your French Mark? ");
    int numberFour = In.getInt();
    System.out.println(" Your average is ");
    System.out.println((numberOne+numberTwo+numberThree+numberFour)/4);
  }
}
    

