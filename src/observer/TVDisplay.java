package observer;

public class TVDisplay implements IObserver {

    private WeatherSensor sensor;
    private double onScreenTemp;

    public TVDisplay(WeatherSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public void update() {
        this.onScreenTemp = sensor.getTemperature();
        display();
    }
    
    public void display(){
        System.out.println("New Temperature on the TV's Display: " + onScreenTemp);
    }
}
