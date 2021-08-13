package com.benjaminkong.dao;

import com.benjaminkong.domain.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Benjamin Kong
 * @create 2021/8/12 20:49
 */
@Repository
public class DepartmentDao {
    //模拟数据库的数据
    private static Map<Integer, Department> department;

    static{
        department=new HashMap<Integer, Department>();
        department.put(101,new Department(101,"教学部"));
        department.put(102,new Department(102,"教研部"));
        department.put(103,new Department(103,"后勤部"));
    }
    //获得所有部门信息
    public Collection<Department> getDepartments(){
        return  department.values();
    }
    //根据id查询部门
    public Department getDepartmentById(Integer id){
        return department.get(id);
    }
    //
}
