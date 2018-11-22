package ObserverParttern.JavaInner;

import ObserverParttern.ThemeAndObserver.Observer;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {

    private float temp;

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    private float humidity;
    private float pressure;

    public void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

}
