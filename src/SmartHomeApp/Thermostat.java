package SmartHomeApp;

public class Thermostat {
    private int temperature = 20;

    public void setTemperature(int temp) {
        System.out.println("(Thermostat) Setting the temperature: " + temp + "°C");
        temperature = temp;
    }

    public void revert() {
        System.out.println("(Thermostat) Return to previous temperature: " + temperature + "°C");
    }

}
