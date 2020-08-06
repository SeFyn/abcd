package cn.kgc.mapper;

import cn.kgc.vo.User;

import java.util.List;


public interface UserMapper {

    int insertUser(User user);

    User selectUser(User user);

    int deleteUser(User user);

    int updateUser(User user);

    List<User> selectUserSale(User user);
}
