package com.hoodee.springframework.context;

import com.hoodee.springframework.beans.BeansException;

/**
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年07月04日 11:19
 */
public interface ConfigurableApplicationContext extends ApplicationContext{

    /**
     * 刷新容器
     * @throws BeansException
     */
    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();
}
