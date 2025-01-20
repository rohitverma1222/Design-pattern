package BehavioralDesignPatterns.OberserverPattern;


import java.util.ArrayList;
import java.util.List;

interface subject {

    void addOberser(OberserDevice device);

    void removeOberser(OberserDevice device);

    void notifyOberser();
}

class WeatherStation implements subject{
    private float temperature;
    private List<OberserDevice> obersers;

    public WeatherStation() {
        this.obersers = new ArrayList<>();
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyOberser();
    }

    @Override
    public void addOberser(OberserDevice device) {
        obersers.add(device);
    }

    @Override
    public void removeOberser(OberserDevice device) {
        obersers.remove(device);
    }

    @Override
    public void notifyOberser() {
        for (OberserDevice oberser : obersers) {
            oberser.update(temperature);  //Runtime polymorphism
        }
    }
}


interface OberserDevice {
    void update(float temp);
}


class mobileDevice implements OberserDevice{
    private float temperature;
    @Override
    public void update(float temperature) {
        this.temperature = temperature;
    }
    public void display() {
        System.out.println("Temperature on mobile device is: " + temperature);
    }
}

class TvDevice implements OberserDevice{
    private float temperature;
    @Override
    public void update(float temperature) {
        this.temperature = temperature;
    }
    public void display() {
        System.out.println("Temperature on Tv device is: " + temperature);
    }
}

public class Oberser {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();
        mobileDevice mobileDevice = new mobileDevice();
        TvDevice tvDevice = new TvDevice();

        weatherStation.addOberser(mobileDevice);
        weatherStation.addOberser(tvDevice);
        weatherStation.setTemperature(30);
        mobileDevice.display();
        tvDevice.display();

        weatherStation.setTemperature(28);
        mobileDevice.display();
        tvDevice.display();
    }
}
