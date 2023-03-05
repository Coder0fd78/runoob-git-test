package com.exception;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1=0;
        int num2=10;
        /**
         * 1.num2/num1 ==>10/0
         * 2.当执行到num2/num1 因为 num1=0，程序就会出现（抛出异常）ArithmeticException
         * 3.当抛出异常或，程序就退出，崩溃了，下面的代码就不会被执行
         * 4.大家想想这样的程序好吗？       不好，不应该出现一个不算致命的问题，就导致整个系统崩溃
         * 5.java设计者，就提供了一个叫异常处理机制来解决该问题
         * 如果程序员，认为一段代码可能会出现异常/问题，可以使用try-catch异常处理机制来解决
         * 从而保证程序的健壮性
         * 将该代码块-》选中-》快捷键 ctrl+alt+t->选中 trc-catch
         * 6.如果进行异常处理，那么即使出现了异常程序可以继续执行*/
        try {
            int res=num2/num1;
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());     //输出异常信息
        }
        System.out.println("程序继续执行...");
    }

/**
 * try{
 *     代码可能有异常
 * }catch(Exception e){
 *     //捕获到异常
 *     1.当异常发生时
 *     2.系统将异常封装成Exception 对象 e，传递给catch
 *     3.程序员自己处理
 *     4.注意如果没有发生异常catch不执行
 *
 * }finally{
 *     //不管try代码块是否异常，始终执行finally
 *     2.所以通常将(资源的关闭)代码放到这里
 * }
 *
 *
 * */
}
