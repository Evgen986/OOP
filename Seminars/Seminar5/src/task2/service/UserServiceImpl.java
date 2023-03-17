package task2.service;

import task2.model.Human;
import task2.model.User;
import task2.model.UsersList;

import java.util.List;

public class UserServiceImpl implements UserService{
    @Override
    public void setHuman() {

    }

    @Override
    public void setCompany() {

    }

    @Override
    public boolean approval(User user) {
        return false;
    }

    public boolean findUser(String name, List <User> list){
        for (User user: list){
            if (user.getName().equalsIgnoreCase(name)) return false;

        }
        return true;
    }
}
