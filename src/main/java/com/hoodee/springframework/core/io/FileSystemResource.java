package com.hoodee.springframework.core.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 通过指定文件路径的方式读取文件信息
 * @version 1.0
 * @author: jianghao
 * @createTime: 2022年07月01日 9:43
 */
public class FileSystemResource implements Resource{

    private final String path;

    private final File file;

    public FileSystemResource(String path) {
        this.path = path;
        this.file = new File(path);
    }

    public FileSystemResource(File file) {
        this.path = file.getPath();
        this.file = file;
    }

    public final String getPath() {
        return this.path;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(this.file);
    }
}
