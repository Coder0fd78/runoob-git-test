package InnerClassCourse;
/**
 *
 * 匿名内部类的演示：
 * */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        AmouseOuterSon amouseOuterSon = new AmouseOuterSon();
        amouseOuterSon.outMethod();
        AmouseOuterFather amouseOuterFather = new AmouseOuterFather();
        amouseOuterFather.test();
    }
}
class AmouseOuterSon{
    private int ni=10; //外部类私有属性
    public void outMethod(){//外部类方法
        //基于接口的匿名内部类
        //1.需求：使用接口IA，并创建对象
        //2.传统方式：写一个类并创建对象
//        class tiger implements IA{
//
//            @Override
//            public void cry() {
//                System.out.println("老虎嗷嗷叫...");
//            }
//        }
//            tiger tiger = new tiger();
//            tiger.cry();
        //3.需求是tiger这个类只用一次以后不再使用
        //4.我们可以使用匿名内部类来简化开发，不去创建tiger
        //5.tiger的编译类型是什么？  ----接口IA
        //6.tiger的运行类型是什么？  ---AmouseOuterSon$1(就是匿名内部类)
        /*
        *   我们看底层：会分配 类名 AmouseOuterSon$1
               class XXX implements IA{
                 @Override
                    public void cry() {
                        System.out.println("老虎叫唤....");
             }
         }
        */
        //7.jdk底层在创建匿名内部类 AmouseOuterSon$1 ，立即马上就创建了 AmouseOuterSon$1对象，并且把地址返回给了tiger
        //8.匿名内部类使用一次，就不能再使用，但是tiger可以一直使用（他只是个变量）
        IA tiger=new IA(){

            @Override
            public void cry() {
                System.out.println("老虎叫唤....");
            }
        };
        System.out.println("tiger的运行类型"+tiger.getClass());
        tiger.cry();

        //基于类的匿名内部类
        //1.编译类型 AmouseOuterFather      运行类型：AmouseOuterSon$2
        //2.底层
        /*
        *   class AmouseOuterSon$2 extends AmouseOuterFather{
        *        @Override
                    public void test() {
                        System.out.println("匿名内部类重写的test方法");
                }
        * }
        *3.jdk底层在创建匿名内部类 AmouseOuterSon$2 ，立即马上就创建了 AmouseOuterSon$2对象，并且把地址返回给了amouseOuterFather
        * */
        AmouseOuterFather amouseOuterFather = new AmouseOuterFather(){
            @Override
            public void test() {
                System.out.println("匿名内部类重写的test方法");
            }
        };
        amouseOuterFather.test();
        System.out.println("amouseOuterFather的运行内存"+amouseOuterFather.getClass());
        //基于抽象类的匿名内部类
        Ao ao = new Ao(){

            @Override
            public void say() {
                System.out.println("匿名内部类重写了抽象类的抽象方法");
            }
        };
        ao.say();
    }

}
interface IA{   //接口
    public void cry();
}
class AmouseOuterFather{    //Father外部类
    public AmouseOuterFather() {
    }
    public void test(){
        System.out.println("AmouseOuterSon$1的test方法");
    }
}

abstract class Ao{
    abstract public void say();
}

//2.
//class tiger implements IA{
//
//    @Override
//    public void cry() {
//        System.out.println("老虎嗷嗷叫...");
//    }
//}

