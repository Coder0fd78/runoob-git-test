package InnerClassCourse;

public class Inner01 {
    public static void main(String[] args) {

    }
}
class Outer{
    private String name;    //属性

    public Outer(String name) {     //构造器
        this.name = name;
    }
    public void m1(){       //方法
        System.out.println("Outer的方法m1（）");
    }
    {   //代码块
        System.out.println("Outer的代码块");
    }

    class inner{    //内部类
        private int age;    //内部类的属性

        public inner(int age) {     //内部类的构造器
            this.age = age;
        }
        {
            System.out.println("Outer的内部类的代码块");    //内部类的代码块
        }

        public void m2(){
            System.out.println("Outer的内部内Inner的方法m2()");    //内部类的方法
        }
    }
}
