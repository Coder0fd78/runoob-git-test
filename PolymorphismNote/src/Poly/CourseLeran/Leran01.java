package Poly.CourseLeran;

import sun.security.provider.Sun;

public class Leran01 {
    public static void main(String[] args) {
        Sub sub = new Sub();//编译类型Sub 运行类型 Sub
        System.out.println(sub.count);//属性输出看编译类型： 所以输出20
        sub.display();//方法输出看运行类型： 还是输出20
        base b=sub;//将sub的空间地址赋值给b 是这两个类的引用指向同一个空间，但是 b的编译类型是base 运行类型是Sub
        System.out.println(b==sub);//相同的空间 是相等的
        System.out.println(b.count);//属性输出看编译类型：所以这里输出的是base  10
        b.display();//方法掉用看运行类型：所以这里输出的是20

    }
}
class base{
    int count=10;
    public void display(){
        System.out.println(this.count);
    }
}
class Sub extends base{
    int count=20;
    public void display(){
        System.out.println(this.count);
    }
}
