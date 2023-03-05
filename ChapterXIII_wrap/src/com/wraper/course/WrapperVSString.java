package com.wraper.course;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class WrapperVSString {
    public static void main(String[] args) {
        //包装类（Integer）->String
        Integer i=100;
        //方式1
        String str1=i+"";
        //方式2
        String str2=i.toString();
        //方式3
        String str3=String.valueOf(i);
        //String -> 包装类（Integer）
        String str4="1234";
        //自动装箱
        Integer i3=Integer.parseInt(str4);
        //构造器
        Integer i4=new Integer(str4);
        System.out.println("ok...");
    }
}
