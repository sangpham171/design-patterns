public class Main {
    public static void main(String[] args) {
        var weatherStation = new WeatherStation();
        var phoneDisplay = new PhoneDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.setMeasurements(20.0f);

    }
}