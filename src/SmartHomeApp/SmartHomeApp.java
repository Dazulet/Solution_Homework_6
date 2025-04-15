package SmartHomeApp;

public class SmartHomeApp {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command lightOn = new TurnOnLightCommand(light);
        Command setTemp = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemote remote = new SmartHomeRemote();
        remote.setCommand("lights", lightOn);
        remote.setCommand("climate", setTemp);

        System.out.println(" Smart Home Control Panel:");
        remote.pressButton("lights");
        remote.pressButton("climate");
        remote.pressUndo();
    }
}

