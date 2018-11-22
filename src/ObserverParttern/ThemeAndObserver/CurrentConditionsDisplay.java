package ObserverParttern.ThemeAndObserver;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("目前状况布告板："+temp+"度，湿度："+humidity);

    }

    @Override
    public void update(float temp, float humidity, float pressure) {

        this.humidity = humidity;
        this.pressure = pressure;
        this.temp = temp;
        display();
    }
}
