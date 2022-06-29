package com.hoodee.springframework.test.bean;

/**
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年06月29日 11:37
 */
public class UserService {

    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(name);
        return sb.toString();
    }
}
