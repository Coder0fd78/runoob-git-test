package InterFacesVsExtends;

public class MonkeySon extends Monkey implements Fish,Bird{
    /**
     * 当子类继承了父类，就自动获得了父类的属性和功能方法
     * 如果子类需要扩展功能，可以通过接口的方式来扩展
     * 可以理解为实现接口是对java单继承机制的补充
     * */
    public MonkeySon(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void flying() {
        System.out.println("小猴子通过学习，可以游泳");
    }

    @Override
    public void Swimming() {
        System.out.println("小猴子通过学习，可以飞");
    }
}
