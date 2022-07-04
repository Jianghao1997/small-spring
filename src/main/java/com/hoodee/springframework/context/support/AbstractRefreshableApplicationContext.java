package com.hoodee.springframework.context.support;

import com.hoodee.springframework.beans.BeansException;
import com.hoodee.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.hoodee.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * 获取Bean工厂和加载资源
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年07月04日 11:54
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}
