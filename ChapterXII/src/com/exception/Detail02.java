package com.exception;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class Detail02 {
    public static void main(String[] args) {
        /**
         * 1.如果try代码块可能有多个异常
         * 2.可以使用多各catch分别捕获不同的异常，相应处理
         * 3.要求子类异常必须写在父类异常的前面
         * */
        try {
            Person person = new Person();
            person=null;
            System.out.println(person.getName());  //空指针异常
            int n1=18;
            int n2=0;
            int res =n1/n2;//算数异常
        } catch (NullPointerException e1) {
            System.out.println("空指针异常");
        }catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("算数异常");
        }
    }
}
class Person{
    private String name="jack";

    public String getName() {
        return name;
    }
}