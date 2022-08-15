package com.hoodee.springframework.test.bean;

import java.util.Random;

/**
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年08月15日 17:04
 */
public class AopTestService implements IAopTestService {

    @Override
    public String queryUserInfo() {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "小傅哥，100001，深圳";
    }

    @Override
    public String register(String userName) {

        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "注册用户：" + userName + " success！";
    }
}
