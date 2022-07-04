package com.hoodee.springframework.test.common;

import com.hoodee.springframework.beans.BeansException;
import com.hoodee.springframework.beans.PropertyValue;
import com.hoodee.springframework.beans.PropertyValues;
import com.hoodee.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.hoodee.springframework.beans.factory.config.BeanDefinition;
import com.hoodee.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年07月04日 12:23
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }
}

