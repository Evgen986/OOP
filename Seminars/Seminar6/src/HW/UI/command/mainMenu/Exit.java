package HW.UI.command.mainMenu;

import HW.UI.command.Command;

public class Exit extends Command {
    public Exit(String nameCommand) {
        super(nameCommand);
    }

    @Override
    public void actionCommand() {
        System.out.println("Работа программы завершена");
    }
}
