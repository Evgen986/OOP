package task2.model;


public class WorkingWithBase implements Operation{

    @Override
    public String addContact(String name, String telephone, BaseList list) {
        Contact contact = new Contact(name, telephone);
        list.addAtList(contact);
        return "Выполнено";
    }

    @Override
    public String findContact(String name, BaseList list) {
        for (Contact contact: list){
            if (contact.getSurname().equals(name)) return contact.toString();
        }
        return "Не найдено!";
    }

    @Override
    public String delContact(String name, BaseList list) {
        if (list.delCont(name)) return "Выполнено";
        else return "Не выполнено!";
    }

//    public String delContact(String name, BaseList list) {
//        int s = list.get;
//        if (1 == 1) return "Выполнено";
//        else return "Не выполнено!";
//    }


    public String printBase(BaseList list){
        StringBuffer buffer = new StringBuffer();
        for(Contact contact: list){
            buffer.append(contact.toString() + "\n");
        }
        return buffer.toString();
    }

    public String editContact(String lastName, String newName, String phone, BaseList list){
        if (list.editCont(lastName, newName, phone)) return "Выполнено";
        else return "Не выполнено!";
    }
}
