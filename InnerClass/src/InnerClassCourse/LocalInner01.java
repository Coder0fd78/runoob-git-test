package InnerClassCourse;
/**
 * 小结：
 *      1.局部内部类定义在方法或者代码块中
 *      2.作用域在方法或代码块中
 *      3.本质任然是个类
 * */
public class LocalInner01 {
    public static void main(String[] args) {
        L_Outer l_outer=new L_Outer();
        System.out.println("l_outer的Hashcode"+l_outer); //可以发现L_Outer.this和l_outer的HashCode完全一致
        l_outer.L_Outer1();
    }
}
class L_Outer{//外部类
    private int n1=10;
    public void L_Outer1(){//方法
        /**
         * 1.局部内部类是定义在类的局部位置，通常在方法
         * 2.可以直接俄访问外部类的所有成员，包括私有的
         * 3.不能添加访问修饰符，但可以使用final修饰
         * 4.作用域：仅仅在定义它的方法中或代码块中
         * 5.外部类--访问--》局部内部类的成员：创建对象，在访问（必须在作用域内）
         * 6.外部其他类--不能访问--》局部内部类（因为 局部内部类地位是一个局部变量）
         * 7.如果外部类和局部内部类方法重名时，默认遵循就近原则，如果像访问外部类的成员，则可使用（外部类名.this.成员）
         * */
        //局部内部类是定义在类的局部位置，通常在方法
       final class l_Inner{
           private int n1=88;
           //不能添加访问修饰符，但可以使用final修饰(如果加了final就不能被继承了)
            public void L_Inner(){
                //可以直接俄访问外部类的所有成员，包括私有的
                System.out.println("n1="+n1);
                //如果外部类和局部内部类方法重名时，默认遵循就近原则，如果像访问外部类的成员，则可使用（外部类名.this.成员）
                System.out.println("外部类的n1"+L_Outer.this.n1);
                //这里的L_Outer.this 相当于外部类的一个对象 可以通过HashCode 来判断
                System.out.println("L_Outer.this的Hashcode"+L_Outer.this);
                L_Outer2();
            }
        }
       // 外部类--访问--》局部内部类的成员：创建对象，在访问（必须在作用域内）
        l_Inner l_inner=new l_Inner();
       l_inner.L_Inner();
    }

    private void L_Outer2(){    //外部类的私有方法
        System.out.println("L_Outer02()");
    }
}
