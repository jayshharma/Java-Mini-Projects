class UserPass
{
  public static void main(String[] args)
  {
    String correctPassword = "12345";
    String correctUsername = "JaySharma03";
    System.out.println("Enter your username");
    String userName = In.getString();
    System.out.println ("Enter your password");
    String passWord = In.getString();
    if ((passWord. equals (correctPassword)) && (userName. equals (correctUsername)))
    {
      System.out.println("You got all of them correct");
    }
    else if ((passWord. equals (correctPassword)) && (userName != (correctUsername)))
    {
     System.out.println("You got one of them correct");
    }
    else if ((passWord != (correctPassword)) && (userName != (correctUsername)))
    {
      System.out.println("Sorry, you got none of them correct");
  }
}
}