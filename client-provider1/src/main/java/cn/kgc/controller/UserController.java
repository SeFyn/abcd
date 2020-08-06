package cn.kgc.controller;


import cn.kgc.service.UserService;
import cn.kgc.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController  {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/reg.do",method = RequestMethod.POST)
    public int register(@RequestBody User user) {
        return userService.register(user);
    }
    @RequestMapping(value = "/login.do",method = RequestMethod.GET)
    public User login(@RequestBody User user) {
        return userService.login(user);
    }
    @RequestMapping(value = "/logout.do",method = RequestMethod.DELETE)
    public int logout(@RequestBody User user) {
        return userService.logout(user);
    }
    @RequestMapping(value = "/edit.do",method = RequestMethod.PUT)
    public int editUser(@RequestBody User user) {
        return userService.editUser(user);
    }
    @RequestMapping(value = "/userSale.do",method = RequestMethod.GET)
    public List<User> selectUserSale(User user) {
        return userService.selectUserSale(user);
    }
}
