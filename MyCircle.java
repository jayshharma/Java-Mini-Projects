public class MyCircle 
{
  public static void main(String[] args) 
  { 
    double pi = 3.1415;
    System.out.println("Enter the radius of your circle."); 
    double radius = In.getDouble();
    double circleArea = (pi*(radius*radius));
    System.out.println("The Area of your circle is " + circleArea);
    double circleCircumference = (2*pi*radius);
    System.out.println("The Cirumference of your circle is " + circleCircumference);           
  }
}

