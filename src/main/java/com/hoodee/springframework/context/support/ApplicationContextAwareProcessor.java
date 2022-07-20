package com.hoodee.springframework.context.support;

import com.hoodee.springframework.beans.BeansException;
import com.hoodee.springframework.beans.factory.config.BeanPostProcessor;
import com.hoodee.springframework.context.ApplicationContext;
import com.hoodee.springframework.context.ApplicationContextAware;

/**
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年07月20日 15:01
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessorBeforeInitialization(Object bean, String name) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessorAfterInitialization(Object bean, String name) throws BeansException {
        return bean;
    }
}
