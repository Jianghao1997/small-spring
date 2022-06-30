package com.hoodee.springframework.beans;

/**
 * 属性值
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年06月29日 16:15
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

}
