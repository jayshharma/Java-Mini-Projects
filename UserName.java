class UserName
{
  public static void main (String[] args)
{
  String name = ("Jay");
  System.out.println ("What is your name?");
  String getName = In.getString();
  if (getName.equals ("Jay"))
  {
       System.out.println("That is my name!");
  }
    else 
    {
  System.out.println ("That's a unique name," + getName);
  }
}
}
