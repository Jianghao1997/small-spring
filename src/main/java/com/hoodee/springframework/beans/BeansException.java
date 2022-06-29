package com.hoodee.springframework.beans;

/**
 * 定义 Bean 异常
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年06月29日 12:07
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
