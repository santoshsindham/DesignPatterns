package behavioral.command;

public class HomeAutomationRemote {

    ICommand iCommand;

    public void setCommand(ICommand iCommand) {
        this.iCommand = iCommand;
    }

    public void buttonPressed(){
        iCommand.execute();
    }
}
