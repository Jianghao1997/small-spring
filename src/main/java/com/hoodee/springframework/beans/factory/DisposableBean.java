package com.hoodee.springframework.beans.factory;

/**
 * 定义销毁方法的接口
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年07月04日 14:35
 */
public interface DisposableBean {

    void destroy() throws Exception;
}
