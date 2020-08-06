package cn.kgc.controller;


import cn.kgc.feign.UserFeign;
import cn.kgc.util.ResultUtil;
import cn.kgc.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserFeign userFeign;

    @RequestMapping(value = "/reg.do",method = RequestMethod.POST)
    public ResultUtil register(@RequestBody User user){
        return userFeign.register(user);
    }

    @RequestMapping(value = "/login.do",method = RequestMethod.GET)
    public ResultUtil login(@RequestBody User user){
        return userFeign.login(user);
    }
    @RequestMapping(value = "/logout.do",method = RequestMethod.DELETE)
    public ResultUtil logout(@RequestBody User user){
        return userFeign.logout(user);
    }
    @RequestMapping(value = "/edit.do",method = RequestMethod.PUT)
    public ResultUtil editUser(@RequestBody User user){
        return userFeign.editUser(user);
    }
    @RequestMapping(value = "/userSale.do",method = RequestMethod.GET)
    public ResultUtil selectUserSale(User user){
        return userFeign.selectUserSale(user);
    }

}
