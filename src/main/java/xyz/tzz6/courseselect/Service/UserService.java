package xyz.tzz6.courseselect.Service;

import xyz.tzz6.courseselect.Model.DO.User;

import java.util.List;

public interface UserService {
    User login(User user);

    Iterable<User> findAll();

    User findByStuId(Long stu_id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

}
