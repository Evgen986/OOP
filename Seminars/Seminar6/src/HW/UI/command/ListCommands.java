package HW.UI.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCommands implements Iterable<Command>{
    List <Command> commandList = new ArrayList<>();

    public ListCommands() {}

    public void setCommand(Command command){
        commandList.add(command);
    }
    public List<Command> getList(){
        return commandList;
    }
    public int getSize(){
        return commandList.size();
    }
    @Override
    public Iterator<Command> iterator() {
        return commandList.iterator();
    }
}
