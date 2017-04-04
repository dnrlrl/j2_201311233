package headfirst.observer.weather;

import java.util.*;

public class WeatherStation {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
 
    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    //StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    //ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

    weatherData.setMeasurements(70, 50, 35.2f);
    weatherData.setMeasurements(80, 60, 30.2f);
    weatherData.setMeasurements(75, 80, 32.2f);
  }
}