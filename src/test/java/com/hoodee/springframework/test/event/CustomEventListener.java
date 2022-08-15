package com.hoodee.springframework.test.event;

import com.hoodee.springframework.context.ApplicationListener;

import java.util.Date;

/**
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年08月15日 15:35
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("收到：" + event.getSource() + "消息;时间：" + new Date());
        System.out.println("消息：" + event.getId() + ":" + event.getMessage());
    }
}
