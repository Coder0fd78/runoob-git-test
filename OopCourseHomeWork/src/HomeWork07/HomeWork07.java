package HomeWork07;

public class HomeWork07 {

}
class Test{
    //父类
    String name="Rose";
    Test(){
        System.out.println("Test");//2 第一句输出 Test
    }
    Test(String name){
        this.name=name; //7 将父类的Rose 改为了 John
    }
}
class Demo extends Test{
    String name="Jack";
    Demo(){
        super();
        System.out.println("Demo");//3 第二句输出 Demo
    }
    Demo(String s){
        super(s); //6
    }
    public void test(){
        System.out.println(super.name);//4  第三局输出 Rose  //8 第五局输出 John
        System.out.println(this.name);//5 第四局输出  Jack   //9 第六局输出 Jack
    }

    public static void main(String[] args) {

        new Demo().test();//1

        new Demo("john").test();
    }
}
