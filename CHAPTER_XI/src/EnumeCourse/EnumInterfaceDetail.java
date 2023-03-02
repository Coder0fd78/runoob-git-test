package EnumeCourse;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class EnumInterfaceDetail {
    /**
     * 枚举类实现接口//因为枚举类已经隐式继承了Java.lang.Enum了所以不能再继承（java是单继承机制）
     * */
    public static void main(String[] args) {
        O.DDP.say();
    }

}
enum O implements I,Q{
    OOP("oop"),DDP("ddp");
    private String name;

    O(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println(O.DDP.name);
    }

    @Override
    public void compare() {
        System.out.println(O.DDP.compareTo(OOP));
    }
}
interface I{
    public void say();
}
interface Q{
    public void compare();
}