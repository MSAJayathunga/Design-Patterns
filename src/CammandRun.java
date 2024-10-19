interface Command {
    void execute();
}

class Light {
    void turnOn() {
        System.out.println("Light is on");
    }
    void turnOff() {
        System.out.println("Light is off");
    }
}

class TurnOnCommand implements Command {
    private Light light;
    TurnOnCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.turnOn();
    }
}

class TurnOffCommand implements Command {
    private Light light;
    TurnOffCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.turnOff();
    }
}

class RemoteControl {
    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }
    void pressButton() {
        command.execute();
    }
}



// Main class
public class CammandRun{
    public static void main(String[] args) {
        Light light = new Light();

        // Concrete command objects
        Command turnOn = new TurnOnCommand(light);
        Command turnOff = new TurnOffCommand(light);

        // Invoker
        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOn);
        remote.pressButton();

        remote.setCommand(turnOff);
        remote.pressButton();
    }
}
