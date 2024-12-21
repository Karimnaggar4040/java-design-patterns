package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherSensor implements IObservable {
    private double temperature;
    private List<IObserver> observers;

    public WeatherSensor() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers){
            observer.update();
        }
    }
    
    public double getTemperature() {
        return temperature;
    }
    
    // Every time the temperature is set to a new value it will notify the observers.
    public void setTemperature(double temp){
        this.temperature = temp;
        notifyObservers();
    }
    
}
