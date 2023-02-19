package com.extendsCourse.Second;

public class CourseTest02 {
    public static void main(String[] args) {
        C c = new C();
        /*
        * 1:我是A类
        * 2：haha我是B类的有参构造器
        * 3：我是C类的有参构造器
        * 4：我是C类的无参构造器
        *
        * */
    }
}
class A{
    public A(){
        //这是第四步，在第三步被调用成为第一个输出的句子
        System.out.println("我是A类");
    }
}
class B extends A{
    public B(){
        System.out.println("我是B的无参构造器");
    }
    public B(String name){
        //这是第三步：默认的super(),会调用A的无参构造器
        System.out.println(name+"我是B类的有参构造器");//这是第五步：执行完super()之后执行的，这是输出的第二个句子
    }
}
class C extends B{
    public C(){
        this("hello"); //这是第一步：执行C的有参构造器
        System.out.println("我是C类的无参构造器");//这是第七步：输出的第四个句子

    }
    public C(String name){
        super("haha");//这是第二部：调用B的有参构造器
        System.out.println("我是C类的有参构造器");//这是第六步：执行玩super("haha")，输出的第三个句子
    }
}