package com.hoodee.springframework.context;

/**
 * 是整个一个事件的发布接口，所有的事件都需要从这个接口发布出去。
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年08月15日 15:19
 */
public interface ApplicationEventPublisher {

    void publishEvent(ApplicationEvent event);
}
