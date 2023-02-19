package ExtendsDetail;

public class Base {
    //父类
    public int n1=100;
    protected int n2=200;
    int n3=300;
    private int n4=400;
    //无参构造器
    public Base() {
        System.out.println("父类的无参构造器被调用base().....");
    }
    //如果父类没有提供无参构造器
    //则必须在子类构造器中用super去指定父类的哪个构造器完成对父类的初始化工作，否则，编译不会通过
    public Base(int a,int b){
        System.out.println("父类的这个构造器Base(int a,int b)被调用...");
    }
    public Base(int b){
        System.out.println("父类的这个构造器Base(int b)被调用...");
    }

    public int getN4() {
        return n4;
    }

    public void test100(){
        System.out.println("test100...");
    }
    protected  void test200(){
        System.out.println("test200...");
    }
    void test300(){
        System.out.println("test300...");
    }
    private void test400(){
        System.out.println("test400...");
    }
    public void CallTest400(){
        test400();
    }

}
