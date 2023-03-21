package HW.UI.command.mainMenu;

import HW.UI.UIConsole;
import HW.UI.command.Command;

public class AddAnimal extends Command {
    UIConsole console = new UIConsole();
    public AddAnimal(String nameCommand) {
        super(nameCommand);
    }

    @Override
    public void actionCommand() {
        console.createMenu();
    }
}
