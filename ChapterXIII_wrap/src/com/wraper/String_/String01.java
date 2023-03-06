package com.wraper.String_;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class String01 {
    public static void main(String[] args) {
        /**
         * 1.String 对象用于保存字符串，也就是一组字符序列
         * 2.“jack” 字符串常量，双引号括起的字符序列
         * 3.字符串的字符使用Unicode字符编码，一个字符（不区分字母还是汉字）占两个字节
         * 4.String 类有很多构造器，构造器的重载常用的有:
         *      String s1=new String();
         *      String s2=new String(String original);
         *      String s3=new String(char[] a);
         *      String s4=new String(char[] a,int startIndex ,int count)
         *      String s5=new String(byte[] b)
         * 5.String 类实现了接口 Serializable [String 可以串行化：可以在网络传输]
         * 6.String 是 final 类，不能被其他类继承
         * 7.String 有属性 private final char value[] ; 用于存放字符串内容
         * 8.一定要注意：value 是一个final类型，不可以修改（不可以修改指向的地址空间，可以修改里面的内容） --见下方实例
         * */
        String name="jack";
        name ="tom";
        final char value[]={'a','b','v'};
        value[0]='H';
        //一定要注意：value 是一个final类型，不可以修改（不可以修改指向的地址空间，可以修改里面的内容）
//        char A[]={'a'};
//        value=A;
        /**创建String的两种方式：
         * 1.方式一：直接赋值 String s="hspedu";
         * 2.方式二：调用构造器String s=new String("hspedu");*/
        //方式一：先从常量池查看是否有hspedu 数据空间，如果有直接指向；如果没有则重新创建，然后指向。s最终指向的常量池的是空间地址
        String s="hspedu";
        //方式二：先在堆中创建空寂，里面维护了value属性，指向常量池的hsp空间。如果常量池没有"hsp"，重新创建，如果有，直接通过value指向。最终指向的是堆中的空间地址
       String s1=new String("hspedu");
    }
}
