package Abstract;

public class abstractDetail {
    /**
     * 1.抽象类不能被实例化
     * 2.抽象类不一定包含abstract方法，也就是说，抽象类可以没有abstract方法
     * 3.一旦包含abstract方法，则这个类必须声明为abstract类
     * 4.abstract只能修饰类和方法，不能修饰属性和其他
     * 5.抽象类可以有任意的成员【抽象类本质还是类】
     * 6.抽象方法不能有主题
     * 7.如果一个类继承了抽象类，则他必须实现抽象类的所有抽象方法，除非他自己也声明为抽象方法
     * 8.抽象方法不能使用 private，final 和static 来修饰，因为这些关键字都是和重写相违背的
     * */
    public static void main(String[] args) {
//        A a = new A();  //     * 1.抽象类不能被实例化
    }
}
 abstract class A{
    //2.抽象类不一定包含abstract方法，也就是说，抽象类可以没有abstract方法
     //而且他还可以有实现方法
//    public void A(){
//        System.out.println("555");
//    }
     public abstract void a();
}

//如果一个类继承了抽象类，则他必须实现抽象类的所有抽象方法，除非他自己也声明为抽象方法
class B extends A{

    @Override
    public void a() {
        //实现方法
    }
}