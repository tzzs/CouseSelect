package xyz.tzz6.courseselect.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.tzz6.courseselect.Repository.UserRepository;
import xyz.tzz6.courseselect.Model.DO.User;

@Controller
@RequestMapping("/demo")
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/add")
    public @ResponseBody
    String addNewUser(@RequestParam Long stu_id, @RequestParam String password) {
        User n = new User();
        n.setStu_id(stu_id);
        n.setPassword(password);
        userRepository.save(n);
        return "Saved";
    }


    @GetMapping("/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
