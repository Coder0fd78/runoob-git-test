package ExtendsDetail;

public class Sub extends Base {
    //子类

    public Sub() {
        //无参构造器
//        super();/*默认调用父类的无参构造器*/
        /**/
        //如果父类没有提供无参构造器
        //则必须在子类构造器中用super去指定父类的哪个构造器完成对父类的初始化工作，否则，编译不会通过
        super(8,8);
        System.out.println("子类的无参构造器被调用了Sub()......");
    }
    public Sub(String name,int a){
        //调用父类的Base(int b)构造器
        //super(8,8);
   super(8);
        //this("sr");
        //super只能在构造器里使用，super和this都只能在构造器第一行使用 所以不能同时出现

    }
    /*当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器，如果父类没有提供无参构造器
     * 则必须在子类构造器中用super去指定父类的哪个构造器完成对父类的初始化工作，否则，编译不会通过*/
    public Sub(String name){
        //如果父类没有提供无参构造器
        //则必须在子类构造器中用super去指定父类的哪个构造器完成对父类的初始化工作，否则，编译不会通过

        //调用父类的Base(int a,int b)
        super(8,8);//

        System.out.println("子类的这个构造器Sub(String name)被调用");
    }
    public void SayOK(){
        /*
        * 子类继承了所有的属性和方法；
        * 非私有的属性和方法可以在子类直接访问
        * ,但是私有的方法不能在子类直接访问
        * ,如果想要访问私有需要在父类建立公共的方法
        * */
        //eg:
        System.out.println(n1+" "+n2+" "+n3+" ");//无法获取n4，因为没有权限
        //如果需要访问到n4需要通过父类的公共方法Get n4 return n4;
        System.out.println(getN4());
        //如果需要访问到test400这个私有的方法需要通过在父类建立公共的方法调用
        Base base = new Base(8,8);
        base.CallTest400();
    }
}
