package HW.UI.command;

public abstract class Command {
    private String nameCommand;

    public Command(String nameCommand) {
        this.nameCommand = nameCommand;
    }

    public abstract void actionCommand();

    @Override
    public String toString() {
        return nameCommand;
    }
}
