package cn.kgc.feign;

import cn.kgc.util.ResultUtil;
import cn.kgc.vo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@FeignClient(name = "provider",fallback = UserFeignFallBack.class)
public interface UserFeign {


    @RequestMapping(value = "/reg.do",method = RequestMethod.POST)
    public ResultUtil register(@RequestBody User user);

    @RequestMapping(value = "/login.do",method = RequestMethod.GET)
    public ResultUtil login(@RequestBody User user);
    @RequestMapping(value = "/logout.do",method = RequestMethod.DELETE)
    public ResultUtil logout(@RequestBody User user);
    @RequestMapping(value = "/edit.do",method = RequestMethod.PUT)
    public ResultUtil editUser(@RequestBody User user);
    @RequestMapping(value = "/userSale.do",method = RequestMethod.GET)
    public ResultUtil selectUserSale(User user);

}
