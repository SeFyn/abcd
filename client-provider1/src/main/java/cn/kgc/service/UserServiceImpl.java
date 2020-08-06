package cn.kgc.service;

import cn.kgc.mapper.UserMapper;
import cn.kgc.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public int register(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public User login(User user) {

        ValueOperations valueOperations = redisTemplate.opsForValue();
        User user1 = userMapper.selectUser(user);
        String key="login-"+user.getId();
            if (!redisTemplate.hasKey(key)){
                valueOperations.set(key,user1);
            }
        return user1;
    }

    @Override
    public int logout(User user) {
        return userMapper.deleteUser(user);
    }

    @Override
    public int editUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public List<User> selectUserSale(User user) {

        ListOperations<String,User> valueOperations = redisTemplate.opsForList();
        List<User> user1 = userMapper.selectUserSale(user);
        String key="usersale-"+user.getId();
        if (!redisTemplate.hasKey(key)){
            valueOperations.leftPushAll(key,user1);
        }
        return user1;






    }
}
