class RadsDegrees   
{
  public static void main(String[] args) 
  { 
     double pi = (3.1415);
     System.out.println("Enter the value in degrees.");
     double degrees = In.getDouble();
     double radians = (degrees*pi/180);
     System.out.println(degrees + " degrees in radians is " + radians);
  }
}
