package com.hoodee.springframework.context.event;

/**
 * 刷新动作
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年08月15日 14:55
 */
public class ContextRefreshedEvent extends ApplicationContextEvent{
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ContextRefreshedEvent(Object source) {
        super(source);
    }
}
