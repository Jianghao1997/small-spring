package com.hoodee.springframework.beans.factory.support;

import com.hoodee.springframework.beans.factory.config.BeanDefinition;

/**
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年06月29日 12:06
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
