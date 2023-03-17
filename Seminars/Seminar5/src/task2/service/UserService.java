package task2.service;

import task2.model.User;

import java.util.List;

public interface UserService {
    void setHuman();
    void setCompany();
    boolean approval(User user);
    boolean findUser(String name, List <User> list);
}
