package com.hoodee.springframework.test.common;

import com.hoodee.springframework.beans.BeansException;
import com.hoodee.springframework.beans.factory.config.BeanPostProcessor;
import com.hoodee.springframework.test.bean.UserService;

/**
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年07月04日 12:24
 */
public class MyBeanPostProcessor  implements BeanPostProcessor {
    @Override
    public Object postProcessorBeforeInitialization(Object bean, String name) throws BeansException {
        if ("userService".equals(name)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为：北京");
        }
        return bean;
    }

    @Override
    public Object postProcessorAfterInitialization(Object bean, String name) throws BeansException {
        return bean;
    }
}
