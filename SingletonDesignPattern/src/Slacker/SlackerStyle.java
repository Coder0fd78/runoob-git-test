package Slacker;

public class SlackerStyle {
    public static void main(String[] args) {
        /*加载类的时候不会掉用构造器
        * 掉用的时候才会创建*/
    }
}
class cat{
    /***
     * 懒汉式:
     */
    private String name;
    //1.私有化构造器
    private cat(String name) {
        this.name = name;
    }
    //2.定义一个私有的静态属性
    private static cat cat1;
    //3.定义一个静态的public方法，返回cat对象
    public static cat getInstance(){
        if (cat1==null){
            cat1=new cat("小白");
        }
        return cat1;
    }

    @Override
    public String toString() {
        return "小猫的名字"+name;
    }
}
