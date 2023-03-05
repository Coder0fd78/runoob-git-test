package com.wraper.course;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class wraper_In {
    public static void main(String[] args) {
        //boolean -> Boolean
        //char -> Character
        //byte ->Byte
        //long -> Long
        //int ->Integer
        //演示int -> Integer 的装箱和拆箱

        //手动装箱（int -> Integer）：
        int n1=100;
        Integer integer=new Integer(n1);
        Integer integer1=Integer.valueOf(n1);
        //手动拆箱(Integer -> int)：
        int i= integer.intValue();

        //Jdk5后，就可以自动装箱和自动拆箱（面试常问）
        int n2=200;
        //自动装箱（int -> Integer）：
        Integer integer2=n2;    //底层：Integer integer1=Integer.valueOf(n2);
        //自动拆箱（Integer -> int）
        int n3=integer2;        //底层： int n3= integer.intValue();
        /**================其他类的用法相似========================*/

    }
}
