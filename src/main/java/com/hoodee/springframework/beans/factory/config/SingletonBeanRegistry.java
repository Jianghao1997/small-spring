package com.hoodee.springframework.beans.factory.config;

/**
 * 单例注册接口定义和实现
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年06月29日 12:04
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String name);
}
