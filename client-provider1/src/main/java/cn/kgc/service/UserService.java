package cn.kgc.service;

import cn.kgc.vo.User;

import java.util.List;

public interface UserService {
    int register(User user);

    User login(User user);

    int logout(User user);

    int editUser(User user);
    List<User> selectUserSale(User user);
}
