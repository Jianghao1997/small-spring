package com.hoodee.springframework.core.io;

public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    /**
     * 获取资源
     * @param location
     * @return
     */
    Resource getResource(String location);

}
