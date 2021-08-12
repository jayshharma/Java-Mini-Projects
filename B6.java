public class B6 
{
  public static void main(String[] args) { 
    
    System.out.println("What is your preferred language?");
    System.out.println("\"e\" for english, \"c\" for chinese, \"g\" for gujarati");
    String answer = In.getString();
    if (answer.equals("e")){
      System.out.println("Hello!");
    }
    else if (answer.equals("c")){
      System.out.println("Ni Hao!");
    }
    else if (answer.equals("g")){
      System.out.println("Namaste!");
    }
  }
}
