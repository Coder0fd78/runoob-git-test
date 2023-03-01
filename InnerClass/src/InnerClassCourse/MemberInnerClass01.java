package InnerClassCourse;



public class MemberInnerClass01 {
    public static void main(String[] args) {
        MemberInnerClassTest memberInnerClassTest = new MemberInnerClassTest();
        memberInnerClassTest.t1();
        memberInnerClassTest.new MemberInnerClass();//第一种：相当于 把new 内部类 当成 外部类的一个成员
        memberInnerClassTest.memberInnerClass();//第二种：通过方法掉用
        //如果内部类成员与外部类成员重名的时候遵循就近原则，如果需要访问外部类的成员 外部类名.this.属性

    }
}
class MemberInnerClassTest{//成员内部类是定义在外部类的成员位置上，可以添加任何的修饰符（public protected,private,默认），因为他本来就是个成员
    //作用域： 和其他成员一样
    //成员内部类怎么访问外部类的成员：直接访问就可以包括私有
    //外部类怎么访问成员内部类：创建对象掉用即可
    //外部其他类如何使用到成员内部类 一共三种方式：
    private int b1=8;
    public String name="张三";
    class MemberInnerClass{
        public void say(){
            System.out.println("名字："+name+"b1:"+b1);
        }
    }
    public void t1(){
        System.out.println("使用了成员内部类");
        new MemberInnerClass().say();
    }
    //第二种 编写一个方法返回内部类的实例
    public MemberInnerClass memberInnerClass(){
        return new MemberInnerClass();
    }
}
//第一种
