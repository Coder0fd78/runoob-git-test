/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class HomeWork01 {
    public static void main(String[] args) {
        Car c = new Car();
        /**
         * 1.检查 类是否已经被加载   ---》首先分析，并寻找Car类的代码信息，有就加载，没有就类加载机制加载进来。同时也加载静态变量 static color
         * 2.为对象分配内存空间      --->c在main内部，是局部变量，存放在栈空间中 new Car() new出的实例，存放在堆空间中 ”=“，把new Car 的地址告诉c，c通过四字节地址，引用该实例
         * 3.为对象的字段赋默认值     --->在堆空间中的实例存储的空间中 基本类型 price 初始话为0，静态变量已经加载了为”white“
         * 4.设置对象头              --->标记对象头 便于GC（Java的垃圾回收机制）
         * 5.执行实例的初始化方法        ---》调用构造器中中指定的父类 <init>方法，初始化 price=10
         * 6.执行构造方法             --->无参构造器 price=9 ,color =red
         * */
        Car c1 = new Car(100);
        //同理 如上 ，但color是静态变量，只加载一次，所以这里price=100,color=red(与c共享)

        System.out.println(c);
        System.out.println(c1);
    }
}

class Car {
    double price = 10;
    static String color = "white";

    @Override
    public String toString() {
        return price + "\t" + color;
    }

    public Car() {
        this.price = 9;
        this.color = "red";
    }

    public Car(double price) {
        this.price = price;
    }


}
