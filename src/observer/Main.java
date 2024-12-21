package observer;

public class Main {
    public static void main(String[] args) {
        WeatherSensor sensor = new WeatherSensor();
        PhoneDisplay phoneDisplay = new PhoneDisplay(sensor);
        TVDisplay tvDisplay = new TVDisplay(sensor);
        
        // Register the IObserver concrete classes. 
        sensor.register(phoneDisplay);
        sensor.register(tvDisplay);
        
        // Example on setting and updating the temprature
        sensor.setTemperature(20);
    }
}
