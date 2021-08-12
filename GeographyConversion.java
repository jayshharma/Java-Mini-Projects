class GeographyConversion 
{
  public static void main(String[] args)
  {
    System.out.println("Enter your latitude.");
    double lat = In.getDouble();
    double degrees = lat;
    System.out.printf("Your value in DMS is " + degrees - ("%.0f", degrees));
  }
}