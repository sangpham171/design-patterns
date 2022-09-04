public class PhoneDisplay implements IObserver {

    @Override
    public void update(IObservable observable) {
        if (observable instanceof WeatherStation) {
            System.out.println("PhoneDisplay: " + ((WeatherStation) observable).getTemperature());
        }
    }
}
