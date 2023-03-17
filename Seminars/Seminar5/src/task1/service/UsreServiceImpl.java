package task1.service;

import task1.model.User;

import java.io.FileWriter;

public class UsreServiceImpl implements UserService{
    @Override
    public void save(User user) {
        try(FileWriter fileWriter = new FileWriter("user.txt")){
            fileWriter.write(user.toString());
        }catch (Exception e){
            System.out.println("ошибка сохранения пользователя");
            e.printStackTrace();
        }
    }
}
