package SmartHomeApp;

import java.util.HashMap;
import java.util.Map;

public class SmartHomeRemote {
    private Map<String, Command> commandSlots = new HashMap<>();
    private Command lastCommand;

    public void setCommand(String slot, Command command) {
        commandSlots.put(slot, command);
    }

    public void pressButton(String slot) {
        Command command = commandSlots.get(slot);
        if (command != null) {
            command.execute();
            lastCommand = command;
        } else {
            System.out.println("No command for button: " + slot);
        }
    }

    public void pressUndo() {
        if (lastCommand != null) {
            System.out.println(" Undo last command:");
            lastCommand.undo();
        } else {
            System.out.println("There is nothing to cancel.");
        }
    }
}
