package HomeWork14;

public class HomeWork14 {
    public static void main(String[] args) {
        C c=new C();
    }
}
class A{
    public A(){
        System.out.println("我是A类");//3
    }
}
class  B extends A{
    public B(){
        System.out.println("我是B类的无参构造");
    }
    public B(String name){
        System.out.println("我是B的有参构造器");//4
    }
}
class C extends B{
    public  C(){
        this("hello");//1
        System.out.println("我是C类的无参构造器");//6
    }
    public C(String name){
        super("hahah");//2
        System.out.println("我是C类的有参构造器");//5
    }
}