package com.hoodee.springframework.context.event;

import com.hoodee.springframework.context.ApplicationEvent;
import com.hoodee.springframework.context.ApplicationListener;

/**
 * 事件广播器
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年08月15日 14:56
 */
public interface ApplicationEventMulticaster {

    /**
     * 添加监听
     * @param listener
     */
    void addApplicationListener(ApplicationListener<?> listener);

    /**
     * 移除监听
     * @param listener
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * 广播事件
     * @param event
     */
    void multicastEvent(ApplicationEvent event);
}
