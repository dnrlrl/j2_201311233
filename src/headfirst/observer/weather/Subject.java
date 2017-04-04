package headfirst.observer.weather;

import java.util.ArrayList;

public interface Subject{
  //private ArrayList<Observer>observer;
  abstract public void registerObserver(Observer o);
  abstract public void removeObserver(Observer o);
  public void notifyObservers();
}