package com.hoodee.springframework.test.bean;

/**
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年06月29日 11:37
 */
public class UserService {

    private String name;

    private UserDao userDao;


    public String queryUserInfo() {
        return userDao.queryUserName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(name);
        return sb.toString();
    }
}
