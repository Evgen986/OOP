package task2.model;

public class Contact {
    private String surname;
    private String telephone;

    public Contact(String surname, String telephone) {
        this.surname = surname;
        this.telephone = telephone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return surname + " - " + telephone;
    }
    public static Contact getContact(String name, String phone){
        return new Contact(name, phone);
    }
}
