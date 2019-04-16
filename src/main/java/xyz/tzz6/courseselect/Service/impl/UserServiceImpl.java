package xyz.tzz6.courseselect.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.tzz6.courseselect.Repository.RoleRepository;
import xyz.tzz6.courseselect.Repository.UserRepository;
import xyz.tzz6.courseselect.Model.DO.Role;
import xyz.tzz6.courseselect.Model.DO.User;
import xyz.tzz6.courseselect.Service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User login(User user) {
        return null;
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findByStuId(Long stu_id) {
        return userRepository.findByStu_id(stu_id);
    }

    @Override
    public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRole(userRole);
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }
}
