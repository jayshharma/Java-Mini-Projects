public class B4 {
  
  public static void main(String[] args) { 
   
    System.out.println("What is your age?");
    int age = In.getInt();
    if (age<=13){
      System.out.println("You are a child.");
    }
    if (age>13&&age<=19){
      System.out.println("You are a teen.");
    }
    if (age>19&&age<=65){
      System.out.println("You are an adult.");
    }
    if (age>=65){
      System.out.println("You are a senior citizen.");
    }
  }
}