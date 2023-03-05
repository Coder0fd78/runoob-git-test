package com.exception;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class Try_CatchDetail {
    public static void main(String[] args) {
        //1.如果发生了异常，则异常发生后面的代码不会执行，直接进入catch块
        //2.如果异常没有发生，则顺序执行try的代码块，不会进入到catch
        //3.如果希望不管是否发生异常，都执行某段代码（比如：关闭链接，释放资源）则使用代码-finally
        //4.见Detail02
        //5.可以进行try-finally配合使用，相当于不去捕获异常，因此程序会崩溃。应用场景，执行一段代码，不管是否发生异常都必须完成某个业务逻辑。
        //6.关于try-catch-finally顺序问题：
        //  1.如果没有出现异常，则执行try块中的所有语句，不执行catch块中的语句，如果有finally，最后还需要执行finally中的语句
        //  2.如果出现异常，则try块中异常发生后，try块剩下的语句不再执行。将执行catch中的语句，如果有finally，最后还需执行finally里面的语句！
        try {
            String str="换顺气";
            int a=Integer.parseInt(str);
            System.out.println("数字："+a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息"+e.getMessage());
        }finally {
            System.out.println("finally代码");
        }
        System.out.println("程序继续...");
    }
}
