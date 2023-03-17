package task1.presenter;

import task1.UI.ConsoleUI;
import task1.model.Data;
import task1.model.Operation;

public class Presenter {

    public void start(){
        ConsoleUI consoleUI = new ConsoleUI();
        Data example = new Data(consoleUI.setValue("a"), consoleUI.setValue("b"));
        Operation operation = new Operation();
        consoleUI.printResult(example.toString(), operation.summing(example.getA(), example.getB()));
    }
}
