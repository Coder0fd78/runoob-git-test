package EnumeCourse;

/**
 * @version 1.0
 * @autor LuoJunwei
 */

/**
 * 演示关键字实现枚举Enumeration02
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season2.AUTUMN);
    }
}

enum Season2 {
    //如果使用enum来实现枚举，要求将定义的常量对象卸载最前面
    SPRING("春天", "温暖"),WINTER("冬天", "寒冷"),SUMMER("夏天", "炎热"),AUTUMN("秋天", "凉爽")
    //如果我们使用无参构造器，则直接可以写对象，小括号都可以省略
    ,WHAT
    ;


    //描述

//    public static final Season SPRING = new Season("春天", "温暖");
//    public static final Season WINTER = new Season("冬天", "寒冷");
//    public static final Season SUMMER = new Season("夏天", "炎热");
//    public static final Season AUTUMN = new Season("秋天", "凉爽");
    //如果使用了enum关键字替代class实现枚举类
    /**
     * 1.使用enum代替class
     * 2.public static final Season SPRING = new Season("春天", "温暖")
     * 直接使用 SPRING("春天", "温暖")-即：常量名 （实参列表）
     * 3.如果需要多个常量（对象），使用,号间隔即可
     * 4.如果使用enum来实现枚举，要求将定义的常量对象卸载最前面
     * 5.如果我们使用无参构造器，则直接可以写对象，小括号都可以省略
     */

    private String name;
    private String desc;

    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    private Season2(){

    }


    public String getName() {
        return name;
    }


    public String getDesc() {
        return desc;
    }


    @Override
    public String toString() {
        return "季节：" + getName() + "\t" +
                "特点：" + getDesc();
    }
}
