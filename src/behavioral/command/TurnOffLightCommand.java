package behavioral.command;

public class TurnOffLightCommand implements ICommand {

    Light light;

    public TurnOffLightCommand(Light light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Turning off light.");
        light.turnOff();
    }
}
