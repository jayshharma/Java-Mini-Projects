class Time   
{
  public static void main(String[] args) 
  { 
     System.out.println("Enter the hour(s) value.");
     int hours = In.getInt();
     System.out.println("Enter the minutes value.");
     double minutes = In.getDouble();
     System.out.println("Enter the seconds value.");
     double seconds = In.getDouble();
     double convertedTime = (hours + minutes/60 + seconds/3600);
     System.out.println("The time in hours is " + convertedTime);
  }
}

