package com.wraper.course.Exercise;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class WrapperExercise02 {
    public static void main(String[] args) {
        Integer i=new Integer(1);
        Integer j=new Integer(1);
        System.out.println(i==j);   //false 不是同一个对象
        //这里主要看范围 -128~127 就是直接返回
        Integer m=1;    //Integer.valueOf(1)    ->看valueOf(1)源码

        //  if (i >= IntegerCache.low && i <= IntegerCache.high)
        //            return IntegerCache.cache[i + (-IntegerCache.low)];
        //        return new Integer(i);
        
        Integer n=1;    //Integer.valueOf(1)
        System.out.println(m==n);       //ture

        Integer x=128;
        Integer y=128;
        System.out.println(x==y);   //false
    }

}
