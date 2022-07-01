package com.hoodee.springframework.core.io;

import cn.hutool.core.lang.Assert;
import com.hoodee.springframework.utils.ClassUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 类路径资源加载实现
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年07月01日 9:34
 */
public class ClassPathResource implements Resource {

    private final String classPath;

    private ClassLoader classLoader;

    public ClassPathResource(String classPath) {
        this(classPath, null);
    }

    public ClassPathResource(String classPath, ClassLoader classLoader) {
        Assert.notNull(classPath, "路径不能为null");
        this.classPath = classPath;
        this.classLoader = (classLoader != null ? classLoader : ClassUtils.getDefaultClassLoader());
    }


    @Override
    public InputStream getInputStream() throws IOException {
        InputStream resourceAsStream = classLoader.getResourceAsStream(classPath);
        if (resourceAsStream == null) {
            throw new FileNotFoundException(this.classPath + " 不能被打开，因为该路径不存在");
        }
        return resourceAsStream;
    }
}
