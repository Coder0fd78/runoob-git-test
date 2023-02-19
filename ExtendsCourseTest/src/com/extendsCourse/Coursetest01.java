package com.extendsCourse;

public class Coursetest01 {
    public static void main(String[] args) {
        B b = new B();
        //我的分析：首先加载B类访问到A类，输出“a"和”b name“然后再输出”b"
        //老师的分析：
        //首先调用的时B类的无参构造器，然后到this...就该执行本类的带字符串的构造器B(String name),在B（String name）中还会有一个默认的super()
        //所以第一个输出 a 第二个输出 b name 第三个输出 b
    }
}
class A{
    A(){
        System.out.println("a");
    }//A的无参构造器
    A(String name){
        System.out.println("a name");
    }//A的String构造器
}
class B extends A{
    B(){
        this("abc");//有了this就没有super
        System.out.println("b");
    }//B的无参构造器
    B(String name){
        //super();
        System.out.println("b name");
    }//B的有参构造器
}
