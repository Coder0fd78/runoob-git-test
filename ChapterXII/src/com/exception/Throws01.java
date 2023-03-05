package com.exception;

import java.io.FileInputStream;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class Throws01 {
    public static void main(String[] args) {

    }
    public void f2() throws Exception{
        //创建了一个文件流对象
        //1.这里的异常时一个FileNotFoundException编译异常
        //2.使用前面讲过的try-catch-finally
        //3.使用throws，抛出异常，让调用的f2方法的调用者（方法）处理
        //4.throws后面的异常类型可以是方法产生的异常类型，也可以是他的父类
        //5.throws关键字后面可以是异常列表，及可以抛出多个异常。
        FileInputStream fis=new FileInputStream("d://aa.txt");
    }
}
