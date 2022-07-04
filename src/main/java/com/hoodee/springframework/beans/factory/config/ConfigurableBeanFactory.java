package com.hoodee.springframework.beans.factory.config;

import com.hoodee.springframework.beans.factory.HierarchicalBeanFactory;

public interface ConfigurableBeanFactory  extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
