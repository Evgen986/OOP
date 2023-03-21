package HW.UI.command.mainMenu;

import HW.UI.UIConsole;
import HW.UI.command.Command;

public class PrintAnimals extends Command {
    UIConsole console = new UIConsole();
    public PrintAnimals(String nameCommand) {
        super(nameCommand);
    }

    @Override
    public void actionCommand() {
        console.printAnimals();
    }
}
