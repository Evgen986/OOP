package task2.presenter;

import task2.model.BaseList;
import task2.model.ExportBase;
import task2.model.ImportBase;
import task2.model.WorkingWithBase;
import task2.view.ConsoleUI;
import task2.view.Menu;

public class Presenter {
    private Menu menu;
    public void start(){
        menu = new Menu();
        BaseList baseList = new BaseList();
        ImportBase imBase = new ImportBase();
        imBase.importWithFile(baseList);
        WorkingWithBase wb = new WorkingWithBase();
        ConsoleUI cUI = new ConsoleUI();
        while(menu.getChoice() != 6){
            menu.printMenu();
            menu.setChoice();
            switch (menu.getChoice()){
                case 1:
                    cUI.printMessage(wb.addContact(cUI.getValue("фамилию"), cUI.getValue("телефон"), baseList));
                    break;
                case 2:
                    cUI.printMessage(wb.printBase(baseList));
                    break;
                    case 3:
                    cUI.printMessage(wb.findContact(cUI.getValue("фамилию"), baseList));
                    break;
                case 4:
                    cUI.printMessage(wb.printBase(baseList));
                    cUI.printMessage(wb.delContact(cUI.getValue("фамилию"), baseList));
                    break;
                case 5:
                    cUI.printMessage(wb.printBase(baseList));
                    cUI.printMessage(wb.editContact(
                            cUI.getValue("фамилию"),
                            cUI.getValue("новую фамилию"),
                            cUI.getValue("новый номер телефона"),
                            baseList));
                    break;
                case 6:
                    ExportBase exBase = new ExportBase();
                    exBase.exportBaseWithFile(baseList);
                    cUI.printMessage("Выход");
                    break;
            }
        }
    }
}
