package com.hoodee.springframework.beans.factory.aop;

/**
 * 被代理的目标对象
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年08月15日 16:47
 */
public class TargetSource {

    private final Object target;

    public TargetSource(Object target) {
        this.target = target;
    }


    public Class<?>[] getTargetClass(){
        return this.target.getClass().getInterfaces();
    }

    public Object getTarget() {
        return this.target;
    }
}
