package StaticMethod;

/**
 * 如果我们希望不创建实例，也可以掉用某个方法（即当作工具来使用），这是，把方法做成静态方法时非常合适
 * 当方法中不涉及到任何对象相关的成员，则可以将方法设计成静态方法，提高开发效率
 * 在实际开发，往往会将一些通用的方法，设计成静态方法，这样我们不需要创建对象就可以使用了，比如打印一维数组，冒泡排序，完成某个计算任务等..
 *
 * */
public class StaticMethod {
    public static void main(String[] args) {
        B tom = new B("tom");
        B.payFee(200);
        B marry = new B("marry");
        B.payFee(500);
        B.showFee();

    }
}
class B{
    private String name;//普通成员
    private static double fee=0;//静态变量，累计学费

    //  类方法中不能使用 this 和super
    //类方法中只能访问静态变量，或静态方法
    //静态方法只能访问静态方法静态成员，普通方法既可以访问普通也可以访问静态（必须遵守访问权限）
    public B(String name) {
        this.name = name;
    }
    //1.当方法使用了Static修饰后，该方法就是静态方法
    //2.静态方法就可以访问静态属性/变量
    public void say(){
        //静态：
        B.fee=1;
        //非静态
        name="dd";

    }
    public static void payFee(double fee){
        B.fee+=fee;
    }

    public static void showFee(){
        System.out.println("所有学生交的总学费："+B.fee);
    }
}
