package service;

import dao.UserMapper;
import model.User;

public class UserService {
    private UserMapper dao;

    public void setDao(UserMapper dao) {
        this.dao = dao;
    }
    public void addUser(User user)
    {
        dao.insert(user);
    }
    public void deleteUser(String name)
    {
        dao.deleteByPrimaryKey(name);
    }
    public void updateUser(User  user)
    {
        dao.updateByPrimaryKey(user);
    }
    public void selectUserById(String name)
    {
        dao.selectByPrimaryKey(name);
    }
}
