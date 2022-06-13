 public class Calculator {
    //C = 5/9 * (F -32)
    public double celsius(double fahrenheit){
         double celsiusf=( fahrenheit-32) * 5/9;
        System.out.printf(String.valueOf(celsiusf));
         return celsiusf;



    }

  public double metri(double inch){
        double metriv=(inch*0.0254);
      System.out.println("\nInch in meters :" + metriv);
      return metriv;
  }

  public void distance(float meters, int hour, int minutes, int seconds) {
        int totalHours = (hour * 3600) + minutes * 60 + seconds;
        float kilemetersH = meters/totalHours;
        float metersS = (kilemetersH * 100) / 3600;
        double milesH = kilemetersH/1.609;
      System.out.println("Kilometers/h: " + kilemetersH);
      System.out.println("Metrii/s: " + metersS);
      System.out.println("Miles/h: " + milesH);


  }


}
