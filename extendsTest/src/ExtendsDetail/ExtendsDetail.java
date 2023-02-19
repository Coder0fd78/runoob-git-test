package ExtendsDetail;

public class ExtendsDetail {
    public static void main(String[] args) {
//        Sub sub = new Sub();//创建了子类对象 sub
//        /*从运行结果不难看出父类的无参构造器先被调用了，所以得出：子类必须调用父类的构造器，完成父类的初始化
//        * 那么这是为什么呢：？？ //super()*/
//        /*当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器，如果父类没有提供无参构造器
//        * 则必须在子类构造器中用super去指定父类的哪个构造器完成对父类的初始化工作，否则，编译不会通过*/
//        System.out.println("======第二个对象======");
//       Sub javk = new Sub("javk");
//        sub.SayOK();
        System.out.println("=====第三个对象=====");
        new Sub("javk",8);
    }
}
