package com.hoodee.springframework.context.event;

/**
 * 关闭动作
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年08月15日 14:54
 */
public class ContextClosedEvent extends ApplicationContextEvent{
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ContextClosedEvent(Object source) {
        super(source);
    }
}
