package com.exception.homeWork;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class HomeWork02 {
    public static void main(String[] args) {
        //1.首先发生数组越界异常
        if(args[4].equals("john")){     //可能抛出空指针异常
            System.out.println("AA");
        }else{
            System.out.println("BB");
        }
        Object O=args[2];
        Integer i=(Integer)O;   //这里一定会发生类型转换异常 字符串转比他范围小的Integer 且没先声明
    }
}
