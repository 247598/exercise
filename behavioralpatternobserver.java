package exercise1;


import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer {
    void update(float temperature);
}

// Subject class
class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    public void setTemperature(float temp) {
        this.temperature = temp;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(temperature);
        }
    }
}

// Concrete Observer
class PhoneDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Phone Display: Temp is " + temperature + "°C");
    }
}

// Main class to run the example
public class behavioralpatternobserver {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        PhoneDisplay phone = new PhoneDisplay();
        station.addObserver(phone);

        // simulate temperature changes
        station.setTemperature(25.0f);
        station.setTemperature(30.5f);
    }
}

