package com.exception.Exercise;

import java.io.FileInputStream;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class ThrowsDetail {
    /**
     * 1.对于编译异常，程序中必须处理
     * 2.对于运行时异常，程序中如果没有处理，默认就是throws的方式处理
     * 3.子类重写父类方法的时候对抛出异常的规定：
     *  所抛出的异常类要么和父类抛出的异常一致，要么为父类抛出的异常类型的子类型。
     * 4.在throws过程中，如果有方法try-catch，就相当于处理异常，就可以不必throws
     */
    public static void f(){
        try {
            f3();
        } catch (Exception e) {
            System.out.println("处理了f3中的异常："+e.getMessage());
        }
        //这里调用为什么报错？
        //1.因为f3（）方法抛出的时一个编译异常
        //2.即这是，就要f必须处理这个编译异常
        //3.在f中，要么try-catch-finally，或者继续throws
    }
    public static void f3() throws Exception{
        FileInputStream fis=new FileInputStream("ddd");
    }

    public static void f4(){
        f5();
        //为什么这里不报错呢？
        //因为f5抛出的时运行异常
        //运行异常在java中是有默认处理机制的，并不要求程序员显示处理
    }
    public static void f5() throws ArithmeticException{

    }
}

