package com.hoodee.springframework.beans.factory.support;

import com.hoodee.springframework.beans.BeansException;
import com.hoodee.springframework.beans.factory.FactoryBean;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年07月20日 16:43
 */
public abstract class FactoryBeanRegistrySupport extends DefaultSingletonBeanRegistry {

    protected static final Object NULL_OBJECT = new Object();

    private final Map<String, Object> factoryBeanObjectCache = new ConcurrentHashMap<>();

    protected Object getCacheObjectForFactoryBean(String beanName) {
        Object object = this.factoryBeanObjectCache.get(beanName);
        return (object != NULL_OBJECT ? object : null);
    }

    protected Object getObjectFromFactoryBean(FactoryBean factoryBean, String name) {
        if (factoryBean.isSingleton()) {
            Object object = this.factoryBeanObjectCache.get(name);
            if (object == null) {
                object = doGetObjectFromFactoryBean(factoryBean, name);
                this.factoryBeanObjectCache.put(name, (object != null ? object : NULL_OBJECT));
            }
            return (object != null ? object : NULL_OBJECT);
        } else {
            return doGetObjectFromFactoryBean(factoryBean, name);
        }
    }

    private Object doGetObjectFromFactoryBean(final FactoryBean factoryBean, final String name) {
        try {
            return factoryBean.getObject();
        } catch (Exception e) {
            throw new BeansException("FactoryBean threw exception on object[" + name + "] creation", e);
        }
    }
}
