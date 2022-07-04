package com.hoodee.springframework.beans.factory.config;

import com.hoodee.springframework.beans.BeansException;

public interface BeanPostProcessor {

    /**
     * 在 Bean 对象执行初始化方法之前，执行此方法
     * @param bean
     * @param name
     * @return
     * @throws BeansException
     */
    Object postProcessorBeforeInitialization(Object bean, String name) throws BeansException;

    /**
     * 在 Bean 对象执行初始化方法之后，执行此方法
     * @param bean
     * @param name
     * @return
     * @throws BeansException
     */
    Object postProcessorAfterInitialization(Object bean, String name) throws BeansException;

}
