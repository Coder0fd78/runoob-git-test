public class RecursionMain {
    public static void main(String[] args) {
        //test01
        System.out.println("====递归输出2-5之间的数====");
        RecursionTest01 test01 = new RecursionTest01();
        test01.test(5);
        System.out.println();
        //test02
        System.out.println("====递归5的阶乘====");
        RecursionFactorial test02 = new RecursionFactorial();
        int res = test02.test02(5);
        System.out.println("res=" + res);
        /*
         * 1.执行方法时，就创建一个新的受保护的独立（栈）空间
         * 2.方法的局部变量是独立的，不会相互影响，比如n变量
         * 3.如果方法中使用的是引用类型变量（比如：数组，对象），就会共享该类型的数据
         * 4.递归必须向退出递归的条件逼近，否则就是无限递归，出现StackOverFlowError()死龟了
         * 5.当一个方法执行完毕后，或者遇到了return，就会返回，遵守谁调用，谁返回原则，同时当方法执行完毕或者返回时，该方法也就执行完毕了。
         * */
        //Fibonacci
        System.out.println("====递归输出斐波那契数====");
        RecursionExercise01 fibonacci=new RecursionExercise01();
        int resFibonacci=fibonacci.Fibonacci(7);
        System.out.println("当n=5时对应的斐波那契="+resFibonacci);
    }
}
