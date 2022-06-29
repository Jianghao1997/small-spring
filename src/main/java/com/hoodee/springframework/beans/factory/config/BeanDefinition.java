package com.hoodee.springframework.beans.factory.config;

/**
 * 用于定义 Bean 实例化信息，现在的实现是以一个 Object 存放对象
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年06月29日 11:36
 */
public class BeanDefinition {

    // 由object 改为 class 可以存放Bean的实例化
    private Class  bean;

    public BeanDefinition(Class  bean) {
        this.bean = bean;
    }

    public Class getBeanClass() {
        return bean;
    }

    public void setBeanClass(Class  bean) {
        this.bean = bean;
    }
}
