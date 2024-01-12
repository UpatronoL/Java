package ObserverPattern;

public class WeatherStation {
   public static void main(String[] args) {
       WeatherData weatherData = new WeatherData();
    //    CurrentConditionsDisplay currentDisplay = 
       new CurrentConditionsDisplay(weatherData);

    //    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    //    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

       weatherData.setMeasurments(80, 65, 30.4f);
       weatherData.setMeasurments(82, 70, 29.4f);
       weatherData.setMeasurments(80, 65, 30.4f);
   } 
}
