package Poly.MethodEmbodiment;

public class PloyMethod {
    public static void main(String[] args) {
        B b = new B();
        //我们传入不同的参数，就会调用不同的sum方法，就体现了多态 ---方法的重载
        System.out.println(b.sum(10,20));
        System.out.println(b.sum(10,20,30));
        //方法重写体现多态
        A a = new A();
        b.say();
        a.say();

    }
}
class A{
    public  void say(){
        System.out.println("A的say方法被调用...");
    }
}
class B extends A{
    public int sum(int n1,int n2){
        return n1+n2;
    }
    public int sum(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public void say(){
        System.out.println("B的say方法被调用.....");
    }
}