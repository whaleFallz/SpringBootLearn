package com.benjaminkong.service;

import com.benjaminkong.dao.UserDao;
import com.benjaminkong.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Benjamin Kong
 * @create 2021/8/12 21:32
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDAO;

    public Collection<User> getUserInfo(){
        Collection<User> list = userDAO.getUsers();
        return list;
    }
    public User getUserInfoById(Integer id){
        User user= userDAO.getUserById(id);
        return user;
    }

    public String save(User user){
        userDAO.save(user);
        return "添加成功";
    }
}
