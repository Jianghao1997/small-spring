package com.hoodee.springframework.context.event;

import com.hoodee.springframework.beans.factory.BeanFactory;
import com.hoodee.springframework.context.ApplicationEvent;
import com.hoodee.springframework.context.ApplicationListener;

/**
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年08月15日 15:23
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster{

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @Override
    public void multicastEvent(ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListener(event)) {
            listener.onApplicationEvent(event);
        }
    }
}
