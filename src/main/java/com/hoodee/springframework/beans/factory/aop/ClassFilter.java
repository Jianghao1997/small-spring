package com.hoodee.springframework.beans.factory.aop;

/**
 * 定义类匹配类，用于切点找到给定的接口和目标类。
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年08月15日 16:34
 */
public interface ClassFilter {

    boolean matches(Class<?> clazz);
}
