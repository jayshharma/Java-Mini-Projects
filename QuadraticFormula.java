class QuadraticFormula  
{
  public static void main(String[] args) 
  {
     System.out.println("Enter the a value."); 
     double a = In.getDouble();
     System.out.println("Enter the b value."); 
     double b = In.getDouble();
     System.out.println("Enter the c value."); 
     double c = In.getDouble();
     double squareRoot = (Math.sqrt(Math.pow(b,2)-4*a*c));
     double root1 = (((-b)+(squareRoot))/(2*a));
     double root2 = (((-b)-(squareRoot))/(2*a));
     System.out.println("The first root is ");
     System.out.printf("%.2f %n", root1);
     System.out.println("The second root is ");
     System.out.printf("%.2f %n", root2);
  }
}
