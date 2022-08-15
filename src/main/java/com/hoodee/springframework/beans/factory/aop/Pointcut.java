package com.hoodee.springframework.beans.factory.aop;

/**
 * 切入点接口
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年08月15日 16:34
 */
public interface Pointcut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
