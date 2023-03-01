package InnerClassCourse;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();
        //外部其他类怎么访问
        Outer10.inner10 inner10 = new Outer10.inner10();    //方式一(前提是满足访问权限)
        inner10.say();
        //方式二 编写一个方法 返回实例
        outer10.get();
        //方式三
        Outer10.inner10 inner101= outer10.get();
        inner101.say();

    }
}
class Outer10{
    private int n1=10;
    private static String name="张三";
    //静态内部类
    //1.放在外部类的成员位置
    //2.使用static修饰
    //3.可以直接访问外部类的所有静态成员，包括私有的，但不能直接访问非静态成员（还是遵循静态访问静态原则）
    //4.可以添加任意访问修饰符
    //5.作用域：和其他成员一样，作用与整个类体
    public static class inner10{
        private static String name="小王";//如果内部成员和外部类成员重名 遵循就近原则
        public void say(){
            System.out.println(name);
            System.out.println(Outer10.name);//如果硬要访问外部类静态成员 直接外部类名.成员
        }
    }
    //外部类要访问内部静态类 创建方法就可以
    public void m1(){
        inner10 inner10 = new inner10();
        inner10.say();
    }
    public inner10 get(){
        return new inner10();
    }
}