package ObserverParttern.ThemeAndObserver;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    //当观察者注册时，将它加入list中
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 删除观察者
     *
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i > 0) {
            observers.remove(i);
        }
    }

    /**
     * 通知每个观察者更新状态
     *
     * @param o
     */
    @Override
    public void notifyObserver() {

        for (Object observer : observers) {
            Observer observer1 = (Observer) observer;
            observer1.update(temp, humidity, pressure);
        }
    }

    public void measurementChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

}
