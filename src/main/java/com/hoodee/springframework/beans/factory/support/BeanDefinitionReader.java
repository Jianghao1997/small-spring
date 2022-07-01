package com.hoodee.springframework.beans.factory.support;

import com.hoodee.springframework.beans.BeansException;
import com.hoodee.springframework.core.io.Resource;
import com.hoodee.springframework.core.io.ResourceLoader;

/**
 * Bean定义读取接口
 */
public interface BeanDefinitionReader {

    /**
     * 这里需要注意 getRegistry()、getResourceLoader()，都是用于提供给后面三个方法的工具，加载和注册，这两个方法的实现会包装到抽象类中，以免污染具体的接口实现方法。
     * @return
     */
    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    /**
     * 加载bean定义的方法
     * @param resource
     * @throws BeansException
     */
    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource ...resource) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
