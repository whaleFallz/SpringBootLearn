package com.benjaminkong.dao;

import com.benjaminkong.domain.Department;
import com.benjaminkong.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * @author Benjamin Kong
 * @create 2021/8/12 20:43
 */
@Repository
public class UserDao {
//模拟数据
    private static Map<Integer, User> users=null;
    @Autowired
    private DepartmentDao departmentDao;
    static {
        users = new HashMap<Integer, User>();
        users.put(1001,new User(1001,"AA",21,1,new Department(101,"教学部")));
        users.put(1002,new User(1002,"BB",22,0,new Department(102,"教研部")));
        users.put(1003,new User(1003,"CC",23,1,new Department(103,"后勤部")));
}

    public Collection<User> getUsers() {
            return users.values();
    }
    public User getUserById(Integer id){
            return users.get(id);
    }
    private static Integer initId=1006;
    //增加员工
    public void save(User user){
        if(user.getID()==null){
        user.setID(initId++);
        }
        //先设置类对象
        user.setDepartment(departmentDao.getDepartmentById(user.getDepartment().getId()));
        users.put(user.getID(), user);
    }
    public void delete(Integer id){
        users.remove(id);
    }

}
