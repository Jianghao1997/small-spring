package com.hoodee.springframework.context;

import java.util.EventListener;

/**
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年08月15日 14:59
 */
public interface ApplicationListener <E extends ApplicationEvent> extends EventListener {

    /**
     * Handle an application event.
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);

}
