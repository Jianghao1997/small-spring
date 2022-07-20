package com.hoodee.springframework.context;

import com.hoodee.springframework.beans.BeansException;
import com.hoodee.springframework.beans.factory.Aware;

/**
 * 实现此接口，既能感知到所属的 ApplicationContext
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
