package com.hoodee.springframework.beans.factory.support;

import com.hoodee.springframework.beans.BeansException;
import com.hoodee.springframework.beans.factory.config.BeanDefinition;

/**
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年06月29日 12:06
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String name, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("实例化对象bean失败", e);
        }
        addSingleton(name, bean);
        return bean;
    }
}
