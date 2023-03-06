package com.wraper.String_.Exercise_;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class StringExercise03 {
    public static void main(String[] args) {
        /**知识点：
         * 当调用intern方法时，如果池已经包含一个等于此String对象的字符串用（equals(Object）方法确定），
         * 则返回池中的字符串。否则，将此String对象添加到池中，并返回String对象引用
         * 解读:（1）：b.intern()犯法最终返回的时常量池的地址*/
        String a="hsp";
        String b=new String("hsp");
        System.out.println(a.equals(b));    //T
        System.out.println(a==b);           //F
        System.out.println(a==b.intern());  //T
        System.out.println(b==b.intern());  //F

    }

}
