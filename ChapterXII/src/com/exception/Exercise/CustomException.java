package com.exception.Exercise;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class CustomException {
    public static void main(String[] args) {
        int age=80;
        if(!(age>=10&&age<=120)){
            throw new age("年龄需要在18-120岁之间");
            //throws和throw的区别：
                        //意义            位置              后面跟的东西
            //throws    异常处理的一种方式   方法声明处       异常类型
            //throw     手动生成异常关键字   方法体中        异常对象
        }else
        System.out.println("你的年龄输入正确");
    }
}
//自定义的异常
//一般情况下自定义异常做成运行时异常，我们可以使用默认的处理机制
class age extends RuntimeException{
    public age(String message) {
        super(message);
    }
}
