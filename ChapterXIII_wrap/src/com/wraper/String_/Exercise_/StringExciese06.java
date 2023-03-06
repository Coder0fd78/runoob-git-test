package com.wraper.String_.Exercise_;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class StringExciese06 {
    public static void main(String[] args) {
        /**String 是一个final类，代表不可改变的字符序列
         * 字符串是不可变的。一个字符串对象一旦被分配，其内容不可变*/
        //以下语句创建了几个对象？      2个
//        String s1="hello";
//        s1="haha";
        //以下语句创建了几个对象？      1个
        /**String="hello"+"abv";===>优化等价String a="helloabc";*/
//        String a="hello"+"abc";
        //以下语句创建了几个对象？
        /**
         * 1.先创建一个StringBuilder sb =StringBuilder()
         * 2.执行 sb.append("hello");
         * 3.sb.append("abc");
         * 4.String c=toString();
         * 5.最后其实是c 指向堆中的对象（String）value[]->"helloabc"
         * 重要规则：String c1="ab"+"cd"，常量相加，看的是池。String c1=a+b;变量相加，是在堆中
         *
         * */
        String a1="hello";
        String b1="abc";
        String c=a1+b1;         //3个
    }
}
