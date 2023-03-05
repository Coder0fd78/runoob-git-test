package com.wraper.course.Exercise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class WarpperExercis01 {
    public static void main(String[] args) {
        Double b=100d;      //自动装箱：Double.valueOf(100d);
        Float f=1.5f;       //自动装箱： Float.valueOf(1.5f);
        //经典面试题：
        Object obj1=true?new Integer(1):new Double(2.0);    //三元运算符是一个整体，会提升优先级
        System.out.println(obj1);   //所以这里输出的是1.0，而不是1；
        //
        Object obj2;
        if(true){
            obj2=new Integer(1);
        }else{
            obj2=new Double(2.0);
        }
        System.out.println(obj2);   //这里输出的才是1

    }


}
