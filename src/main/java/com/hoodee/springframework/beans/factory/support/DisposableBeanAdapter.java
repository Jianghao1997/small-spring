package com.hoodee.springframework.beans.factory.support;

import cn.hutool.core.util.StrUtil;
import com.hoodee.springframework.beans.BeansException;
import com.hoodee.springframework.beans.factory.DisposableBean;
import com.hoodee.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Method;

/**
 *
 * 定义销毁方法适配器(接口和配置)
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年07月04日 14:57
 */
public class DisposableBeanAdapter implements DisposableBean {

    private final Object bean;

    private final String beanName;

    private String destroyMethodName;

    public DisposableBeanAdapter(Object bean, String beanName, BeanDefinition beanDefinition) {
        this.bean = bean;
        this.beanName = beanName;
        this.destroyMethodName = beanDefinition.getDestroyMethodName();
    }

    @Override
    public void destroy() throws Exception {
        // 1. 实现接口 DisposableBean
        if (bean instanceof DisposableBean) {
            ((DisposableBean) bean).destroy();
        }

        // 2. 配置信息 destroy-method {判断是为了避免二次执行销毁}
        if (StrUtil.isNotEmpty(destroyMethodName) && !(bean instanceof DisposableBean && "destroy".equals(this.destroyMethodName))) {
            Method destroyMethod = bean.getClass().getMethod(destroyMethodName);
            if (null == destroyMethod) {
                throw new BeansException("未找到名称为： '" + destroyMethodName + "'的销毁方法 bean 名称为： '" + beanName + "'");
            }
            destroyMethod.invoke(bean);
        }
    }
}
