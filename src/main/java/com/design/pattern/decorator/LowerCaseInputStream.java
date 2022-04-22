package com.design.pattern.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 扩展Java输入流，把输入流内的所有大写字符转成小写
 */
public class LowerCaseInputStream extends FilterInputStream{
    /**
     * 一个输入流入参构造函数
     */
    public LowerCaseInputStream(InputStream in){
        super(in);
    }

    /**
     * 装饰读取，支持把大写转成小写
     */
    @Override
    public int read() throws IOException{
        int readValue = super.read();
        int resultValue = -1;
        if(readValue != -1){
            resultValue = Character.toLowerCase((char) readValue);
        }
        return resultValue;
    }

    /**
     * 装饰读取字节数组指定区间的值，支持把大写转成小写
     */
    @Override
    public int read(byte[] b, int off, int len) throws IOException{
        int resultValue = super.read(b, off, len);
        for(int index = off; index < off + resultValue; index++){
            b[index] = (byte) Character.toLowerCase((char) b[index]);
        }
        return resultValue;
    }
}
