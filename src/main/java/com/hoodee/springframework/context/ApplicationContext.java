package com.hoodee.springframework.context;

import com.hoodee.springframework.beans.factory.ListableBeanFactory;

/**
 * 继承于 ListableBeanFactory，也就继承了关于 BeanFactory 方法，比如一些 getBean 的方法
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年07月04日 11:17
 */
public interface ApplicationContext extends ListableBeanFactory {
}
