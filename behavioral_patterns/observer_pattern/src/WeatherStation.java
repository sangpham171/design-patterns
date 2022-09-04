import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {
    private List<IObserver> observers;
    private float temperature;

    public float getTemperature() {
        return temperature;
    }

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    public void setMeasurements(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(this);
        }
    }
}
