package com.benjaminkong.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Benjamin Kong
 * @create 2021/8/12 20:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private  Integer ID;
    private  String name;
    private  int age;
    private int gender;//0：女 1：男
    private Department department;
}
