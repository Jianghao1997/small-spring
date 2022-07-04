package com.hoodee.springframework.beans.factory;

/**
 * 定义初始化接口
 */
public interface InitializingBean {

    /**
     * Bean 处理了属性填充后调用
     *
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;
}