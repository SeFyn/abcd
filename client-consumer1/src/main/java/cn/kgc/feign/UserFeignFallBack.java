package cn.kgc.feign;

import cn.kgc.util.ResultUtil;
import cn.kgc.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.List;

public class UserFeignFallBack implements UserFeign {

private ResultUtil ru=new ResultUtil();
@Autowired
private RedisTemplate redisTemplate;


    @Override
    public ResultUtil register(User user) {

        ru.setMsg("注册失败 ");
        return ru;
    }

    @Override
    public ResultUtil login(User user) {
        String key="login"+user.getId();
        ValueOperations<String,User> valueOperations = redisTemplate.opsForValue();
       if (redisTemplate.hasKey(key)){
           User o= valueOperations.get(key);
           ru.setObj(o);
           ru.setMsg("登录数据来自redis");
       }else{
           ru.setMsg("登录失败");
       }


        return ru;
    }

    @Override
    public ResultUtil logout(User user) {
        ru.setMsg("删除失败 ");
        return ru;
    }

    @Override
    public ResultUtil editUser(User user) {
        ru.setMsg("修改失败 ");
        return ru;
    }

    @Override
    public ResultUtil selectUserSale(User user) {
        String key="usersale"+user.getId();
        ListOperations<String,User> valueOperations = redisTemplate.opsForList();
        if (redisTemplate.hasKey(key)){
            List<User> o= valueOperations.range(key,0,-1);
            ru.setObj(user);
            ru.setMsg("销售数据来自redis");
        }else{
            ru.setMsg("失效失败");
        }


        return ru;
    }
}
