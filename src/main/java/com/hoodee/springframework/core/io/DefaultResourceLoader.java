package com.hoodee.springframework.core.io;

import cn.hutool.core.lang.Assert;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 默认包装资源加载器
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年07月01日 9:50
 */
public class DefaultResourceLoader implements ResourceLoader{

    @Override
    public Resource getResource(String location) {
        Assert.notNull(location, "路径地址不能为空（null）");
        if (location.startsWith(CLASSPATH_URL_PREFIX)) {
            return new ClassPathResource(location.substring(CLASSPATH_URL_PREFIX.length()));
        } else {
            try {
                URL url = new URL(location);
                return new UrlResource(url);
            } catch (MalformedURLException e) {
                return new FileSystemResource(location);
            }
        }
    }
}
