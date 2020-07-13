package com.CodeDemo15;

/**
 * USB接口
 */
public interface USB {
    /**
     * 打开设备
     */
    public abstract void open();

    /**
     * 关闭设备
     */
    public abstract void close();
}
