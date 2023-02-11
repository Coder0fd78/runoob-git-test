import java.util.Scanner;

public class ClassAndObject {

    public static void main(String[] args) {
        cat cat1 = new cat(); //创建对象
        //实体化
        cat1.name = "夏花";
        cat1.age = 3;
        cat1.color = "白色";
        cat1.weight = 5.7;
        //应用
        System.out.println("Cat1的信息：" + cat1.name + "\t" + cat1.age + "\t"
                + cat1.weight + "\t" + cat1.color);

        //调用方法
        cat1.speak();
        System.out.println("请输入要自加多少次");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        cat1.ADD(n);
    }


}

//类
class cat {

    //属性/成员变量
    String name;
    int age;
    double weight;
    String color;

    //方法
    //public:表示这个方法是公开的
    //void:表示方法没有返回值
    //speak（）表示方法名，()这个是形参列表
    public void speak() {
        System.out.println("喵喵喵...");
    }
    public void ADD(int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=i;
        }
        System.out.println("自加N次的值"+sum);
    }
}
