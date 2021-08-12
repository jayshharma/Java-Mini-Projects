public class B7
{
  public static void main(String[] args) { 
    
    System.out.println("Enter a number");
    int number1=In.getInt();
    System.out.println("Enter another number");
    int number2=In.getInt();
    System.out.println("What is " + number1 + " mod " + number2 + "?");
    int input = In.getInt();
    int answer = (number1%number2);
    if (input==answer){
      System.out.println("Congratulations!");
    }
    else{
      System.out.println("Uh oh! The answer is: " + answer);
      System.out.println("Modulo is the remainder of two numbers divided by each other");
    }
    
  }  
}