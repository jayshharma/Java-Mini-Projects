class BooleanVariables
{
  public static void main(String[] args)
  {
    System.out.println("Do you like running?");
    char answer= In.getChar();
    if (answer=='y'||answer=='Y')
    {
      System.out.println("Amazing, I knew you were a trackstar!");
  }
  else if(answer=='n'||answer=='N')
  {
  System.out.println("Yikes, I was looking for the next Usain Bolt!");
}
else
{
  System.out.println("Oh no, you entered the wrong answer!");
}
}
}
