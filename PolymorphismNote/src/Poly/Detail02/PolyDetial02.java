package Poly.Detail02;

public class PolyDetial02 {
    public static void main(String[] args) {
        //属性没有重写之说：属性的值看编译类型
        Base base=new Sub();//向上转型
        System.out.println(base.count);
        //所以这里的count是10 ！！！  注意：属性不能按方法那样说 直接看编译类型就行
        Sub sub = new Sub();
        System.out.println(sub.count); //20

    }
}
class Base{
    int count=10;
}
class Sub extends Base{
    int count=20;
}
