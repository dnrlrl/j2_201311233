package headfirst.observer.weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
  private float temperature;
  private float humidity;
  private Subject weatherData;
  
  public CurrentConditionsDisplay(Subject w){
    this.weatherData=w;
    weatherData.registerObserver(this);
  }
  public void update(float temp, float humidity, float pressure){
    this.temperature=temp;
    this.humidity=humidity;
    display();
  }
    public void display(){
      System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}