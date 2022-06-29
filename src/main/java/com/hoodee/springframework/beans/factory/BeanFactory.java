package com.hoodee.springframework.beans.factory;

import com.hoodee.springframework.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 代表了 Bean 对象的工厂，可以存放 Bean 定义到 Map 中以及获取。
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年06月29日 11:36
 */
public interface BeanFactory {

    public Object getBean(String name);

}
