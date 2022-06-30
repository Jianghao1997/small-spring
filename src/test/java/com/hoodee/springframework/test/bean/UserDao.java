package com.hoodee.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年06月30日 9:43
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "小傅哥");
        hashMap.put("10002", "八杯水");
        hashMap.put("10003", "阿毛啊");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}
