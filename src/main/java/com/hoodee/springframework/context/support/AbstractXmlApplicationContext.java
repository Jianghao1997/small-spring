package com.hoodee.springframework.context.support;

import com.hoodee.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.hoodee.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年07月04日 11:59
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext{

    protected abstract String[] getConfigLocations();

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (configLocations != null) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }
}
