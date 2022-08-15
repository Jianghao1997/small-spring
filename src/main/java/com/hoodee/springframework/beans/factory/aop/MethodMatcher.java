package com.hoodee.springframework.beans.factory.aop;

import java.lang.reflect.Method;

/**
 * 方法匹配，找到表达式范围内匹配下的目标类和方法
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年08月15日 16:36
 */
public interface MethodMatcher {

    boolean matches(Method method, Class<?> targetClass);
}
