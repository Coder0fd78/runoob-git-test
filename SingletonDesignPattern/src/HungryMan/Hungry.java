package HungryMan;

public class Hungry {
    public static void main(String[] args) {
        /*
        * 加载类的时候就掉用了构造器
        * */
        System.out.println(GirlFriend.gf());
    }
}
class GirlFriend{
    private String name;

    //1.构造器私有化
    private  GirlFriend(String name) {
        this.name = name;
    }
    //2.在类的内部实例化一个对象
    private static GirlFriend girlFriend=new GirlFriend("小花");
    //3.提供一个static方法返回，gf对象
    public static GirlFriend gf(){
        return girlFriend;
    }

    @Override
    public String toString() {
        return "女朋友的名字：" +
                 name  ;
    }
}
