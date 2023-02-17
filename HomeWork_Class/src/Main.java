import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        /*A01找出数组中的最大值*/
//        double[] arr;
//        arr = new double[8];
//        System.out.println("输入您需要查找数组：");
//        Scanner getDouble = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = getDouble.nextDouble();
//        }
//        A01 a01 = new A01();
//        System.out.println("这组数的最大值是" + a01.getArrMax(arr));


//        /*A02查找字符串数组中对应的字符串*/
//        String[] StringArr = new String[5];
//        System.out.println("输入你需要判断的字符串数组");
//        Scanner getString = new Scanner(System.in);
//        for (int i = 0; i < StringArr.length; i++) {
//            StringArr[i] = getString.next();
//        }
//        A02 a02=new A02();
//       System.out.println( a02.find(StringArr));


        /*Book更改书本价格*/
//        Book book1=new Book("白夜行",189);
//        Book book2=new Book("辅国论",139);
//        book1.updatePrice(book1);
//        book2.updatePrice(book2);


        /*A03     是 和 实现数组的复制功能CopyArr,输入旧数组，返回一个新数组*/
//        A03 a03=new A03();
//        Scanner getarr=new Scanner(System.in);
//        int[] arr=new int[5];
//        System.out.println("请输入您需要拷贝的数组");
//        for(int i=0;i<arr.length;i++){
//            arr[i]=getarr.nextInt();
//        }
//        System.out.println("原来数组的HashCode"+arr.hashCode());
//        int []arr2;
//        arr2=a03.CopyArr(arr);
//        System.out.println("这是拷贝后的数组：");
//        for(int i=0;i<arr2.length;i++){
//            System.out.print(arr2[i]+"\t");
//        }
//        System.out.println("拷贝后的数组的HashCode"+arr2.hashCode());


        /*定义一个圆类Circle,定义属性，半径，提供显示圆周长的功能方法 ，提供显示圆面积的显示方法*/
//        Circle circle01=new Circle(7.54);
//        circle01.Circumference(circle01);
//        circle01.Area(circle01);


        /*创建一个计算类Cale,在其中定义两个变量表示操作数，定义四个方法实现求和，差，乘，商（除数为0要提示）并创建两个对象分别测试*/
        //对象01
//        Cale cale01 = new Cale(56.2, 0);
//        Cale cale02 = new Cale(178.2, 36.78);
//        cale01.additionMethod(cale01);
//        cale01.divisionMethod(cale01);
//        cale02.multiplicationMethod(cale02);
//        cale02.subtractionMethod(cale02);


        /*设计一个Dog类，有名字，颜色和年龄属性，定义输出方法show显示其信息并创建对象进行测试*/
//        Dog dog=new Dog("小白","红色",2);
//        dog.show();


        /*阅读代码*/
//        new test().count1();
//        test ti=new test();
//        ti.count2();
//        ti.count2();


        /*定义Music类。里面有音乐名name.音乐时长times属性，并播放Play功能和返回本省属性信息的功能方法getinfo*/
//        Music music=new Music("笑傲江湖",300.00);
//        music.Play();
//        System.out.println(music.getInfo());


        /*(1):定义一个Circle类，包含double型Radius属性代表圆半径，——findArea()方法返回圆的面积
         * (2):定义一个类PassObject在类中定义一个方法printAreas()，该 方法的定义如下：public void printAreas(Circle c,int times)
         * (3):在printAreas方法中打印出1到times之间的每个整数半径值，以及对应的面积
         * (4):在main方法中调用printAreas方法，调用完毕后输出当前半径值，*/

//        Yuan yuan = new Yuan(0);
//        PassObject passObject = new PassObject();
//        System.out.println("times" + "\t\t\t" + "Radius");
//        passObject.printAreas(yuan, 1.0);
    }

}


// /*A01找出数组中的最大值*/
class A01 {
    public double getArrMax(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}


///*A02查找字符串数组中对应的字符串*/
class A02 {
    public int find(String[] FindString) {
        int index = -1;
        System.out.println("你需要查找的字符串");
        Scanner getString = new Scanner(System.in);
        String findString = getString.next();
        for (int i = 0; i < FindString.length; i++) {
            if (findString.equals(FindString[i])) {
                index = 1;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }
}


// /*Book更改书本价格*/
class Book {
    String BookName;
    double BookPrice;

    public Book(String BookName, double BookPrice) {
        this.BookPrice = BookPrice;
        this.BookName = BookName;
    }

    public void updatePrice(Book book) {
        if (BookPrice > 150) {
            BookPrice = 150;
        }
        if (BookPrice > 100 && BookPrice < 150) {
            BookPrice = 100;
        }
        System.out.println("这本" + BookName + "书的价格修改后为：" + BookPrice);
    }
}


/*A03     是 和 实现数组的复制功能CopyArr,输入旧数组，返回一个新数组*/
class A03 {
    public int[] CopyArr(int[] arr) {
        int[] copyArr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr1[i] = arr[i];
        }
        return copyArr1;
    }
}


/*定义一个圆类Circle,定义属性，半径，提供显示圆周长的功能方法 ，提供显示圆面积的显示方法*/
class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void Circumference(Circle circle) {
        double circumference = 3.14 * (2 * this.radius);
        System.out.println("您提供的圆的周长是：" + circumference);
    }

    public void Area(Circle circle) {
        double area = 3.14 * (this.radius * this.radius);
        System.out.println("您提供的圆的面积是: " + area);
    }
}


/*创建一个计算类Cale,在其中定义两个变量表示操作数，
定义四个方法实现求和，差，乘，商（除数为0要提示）并创建两个对象分别测试*/
class Cale {
    double variable_1;
    double variable_2;

    public Cale(double variable_1, double variable_2) {
        this.variable_1 = variable_1;
        this.variable_2 = variable_2;
    }

    //加法方法
    public void additionMethod(Cale cale) {
        System.out.println(this.variable_1 + "+" + this.variable_2 + "=" + (this.variable_1 + this.variable_2));
    }

    //减法方法
    public void subtractionMethod(Cale cale) {
        System.out.println(this.variable_1 + "-" + this.variable_2 + "=" + (this.variable_1 - this.variable_2));
    }

    //乘法方法
    public void multiplicationMethod(Cale cale) {
        System.out.println(this.variable_1 + "*" + this.variable_2 + "=" + (this.variable_1 * this.variable_2));
    }

    //除法方法
    public void divisionMethod(Cale cale) {
        if (this.variable_2 != 0) {
            System.out.println(this.variable_1 + "/" + this.variable_2 + "=" + (this.variable_1 / this.variable_2));
        } else {
            System.out.println("你的被除数为0无法进行除法运算");
        }
    }
}


/*设计一个Dog类，有名字，颜色和年龄属性，定义输出方法show显示其信息并创建对象进行测试*/
class Dog {
    String name = "小白";
    String Color = "黄色";
    int age = 3;

    public Dog(String name, String Color, int age) {
        this.age = age;
        this.Color = Color;
        this.name = name;
    }

    public void show() {
        System.out.println("小狗的名字是" + name + "小狗的颜色是" + Color + "小狗的年龄是" + age);
    }
}


/*阅读代码*/
class test {
    int count = 9;

    public void count1() {
        count = 10;
        System.out.println("count1=" + count);
    }

    public void count2() {
        System.out.println("count1=" + count++);
    }
}


/*定义Music类。里面有音乐名name.音乐时长times属性，并播放Play功能和返回本省属性信息的功能方法getinfo*/
class Music {
    String MusicName;
    double times;

    public Music(String MusicName, double times) {
        this.MusicName = MusicName;
        this.times = times;
    }

    //Play
    public void Play() {
        System.out.println(this.MusicName + "正在播放播放时长为：" + this.times);
    }

    //getInfo
    public String getInfo() {
        return "音乐" + this.MusicName + "时长是" + this.times;
    }
}

/*(1):定义一个Circle类，包含double型Radius属性代表圆半径，——findArea()方法返回圆的面积
 * (2):定义一个类PassObject在类中定义一个方法printAreas()，该 方法的定义如下：public void printAreas(Circle c,int times)
 * (3):在printAreas方法中打印出1到times之间的每个整数半径值，以及对应的面积
 * (4):在main方法中调用printAreas方法，调用完毕后输出当前半径值，*/

class Yuan {
    double radius;

    public Yuan(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * this.radius * this.radius;
    }
}

class PassObject {
    public void printAreas(Yuan c, double times) {
        Yuan yuan = new Yuan(times);
        System.out.println(times + "\t\t\t" + yuan.findArea());
        //递归
        if (times < 5) {
            printAreas(c, times + 1);
        } else {
            System.out.println("结束");
        }
    }
}

