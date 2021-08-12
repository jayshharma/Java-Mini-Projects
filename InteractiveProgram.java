class InteractiveProgram
{  
  public static void main(String[] args) 
  { 
    String Username = ("646895");
    System.out.println("Student Name");
    String name = In.getString();
    System.out.println("Student Gender M/F");
    char gender = In.getChar();
    System.out.println("Course Name");
    String courseName1 = In.getString();
    System.out.println("Enter Mark");
    String mark1 = In.getString();
    System.out.println("Course Name");
    String courseName2 = In.getString();
    System.out.println("Enter Mark");
    String mark2 = In.getString();
    System.out.println("Course Name");
    String courseName3 = In.getString();
    System.out.println("Enter Mark");
    String mark3 = In.getString();
    System.out.println("Course Name");
    String courseName4 = In.getString();
    System.out.println("Enter Mark");
    String mark4 = In.getString();
    
    
    System.out.println("__________________________");
    System.out.println(Username);
    System.out.println("Student Name " + "|" + name);
    System.out.println("Student Gender " + "|" + gender);
    System.out.println("Course: " + courseName1 + "|" + mark1);
    System.out.println("Course: " + courseName2 + "|" + mark2);
    System.out.println("Course: " + courseName3 + "|" + mark3);
    System.out.println("Course: " + courseName4 + "|" + mark4);
    System.out.println("__________________________");
  }
}
