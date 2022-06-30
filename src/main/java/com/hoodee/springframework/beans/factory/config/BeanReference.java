package com.hoodee.springframework.beans.factory.config;

/**
 * Bean 的引用
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年06月29日 16:16
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
