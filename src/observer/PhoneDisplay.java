package observer;

public class PhoneDisplay implements IObserver {
    private final WeatherSensor sensor;
    private double onScreenTemp;
    
    public PhoneDisplay (WeatherSensor sensor){
        this.sensor = sensor;
    }

    @Override
    public void update() {
        this.onScreenTemp = sensor.getTemperature();
        display();
    }
    
    public void display(){
        System.out.println("New Temp on Phone Display: " + onScreenTemp);
    }
   
}
