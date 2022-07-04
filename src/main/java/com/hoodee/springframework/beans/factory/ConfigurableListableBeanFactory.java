package com.hoodee.springframework.beans.factory;

import com.hoodee.springframework.beans.BeansException;
import com.hoodee.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.hoodee.springframework.beans.factory.config.BeanDefinition;
import com.hoodee.springframework.beans.factory.config.BeanPostProcessor;
import com.hoodee.springframework.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory  {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
