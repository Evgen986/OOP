package task1.view;

import task1.model.User;
import task1.service.UserService;
import task1.service.UsreServiceImpl;

public class UserView {
    private UserService userService = new UsreServiceImpl();
    public void saveUser(String name, int age, float salary){
        userService.save(new User(name, age, salary));
    }
}
