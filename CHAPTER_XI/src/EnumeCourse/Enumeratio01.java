package EnumeCourse;
/**
 * 第十一章引入：
 * 1. 传统方法创建对象Season （春夏秋冬）
 * 2.但是因为季节只有四季，是固定的。但是我们设计的类可以随意增加，所以我们设计类的思路是失败的，不能体现季节是固定的。
 * 3.从而我们希望季节这个类是定好的，而不用用户去创建---》所以我们引出枚举类
 * 4.那么枚举是什么呢：所谓枚举。枚：一个一个 举：例举，即把具体的对象一个一个的例举出来的类，我们就把该类称为枚举类。
 * //public class Enumeratio01 {
 * //    public static void main(String[] args) {
 * //        //创建Season对象
 * //        Season Spring = new Season("春天","温暖");
 * //        Season Winter = new Season("冬天","寒冷");
 * //        Season Summer = new Season("夏天","炎热");
 * //        Season Autumn = new Season("秋天","凉爽");
 * //
 * //    }
 * //}
 * ////创建季节类
 * //class  Season{
 * //    private String name;
 * //    private String desc;//描述
 * //    //构造器
 * //
 * //    public Season(String name, String desc) {
 * //        this.name = name;
 * //        this.desc = desc;
 * //    }
 * //
 * //    //.get
 * //
 * //    public String getName() {
 * //        return name;
 * //    }
 * //
 * //    public void setName(String name) {
 * //        this.name = name;
 * //    }
 * //
 * //    public String getDesc() {
 * //        return desc;
 * //    }
 * //
 * //    public void setDesc(String desc) {
 * //        this.desc = desc;
 * //    }
 * //}
 * /**
 * 传统方法我们来看枚举类的方法实现季节问题：
 * 问题分析：
 * 创建Season对象如下特点：
 * 1.季节的值是有限的四个（春夏秋冬）
 * 2.只读，且不需要修改
 * 解决方案：
 * 1.枚举（enum）
 * 2.枚举是一组常量的集合
 * 3.可以这样理解：枚举属于一种特殊类，里面包含一组有限且特定的对象
 * 枚举实现的两种方式：
 * 1.自定义枚举类
 * 2.使用enum关键子实现枚举
 */

/** 演示自定义枚举*/
public class Enumeratio01 {
    public static void main(String[] args) {
        //掉用
        System.out.println(Season.AUTUMN);
    }
}

class Season {
    private String name;
    private String desc;//描述
    /*
    构造器
    第一步：把构造器私有化,防止直接被new出来
    第二步：去掉Set方法，防止属性被修改
    第三步：在类的内部创建固定的对象
    第四步： 可以加入final 修饰夫
    (枚举对象根据需要可以有多个属性)
    */
    public static final Season SPRING = new Season("春天", "温暖");
    public static final Season WINTER = new Season("冬天", "寒冷");
    public static final Season SUMMER = new Season("夏天", "炎热");
    public static final Season AUTUMN = new Season("秋天", "凉爽");

    /**注意：枚举对象名一般要求大写*/
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    //.get

    public String getName() {
        return name;
    }

/*
    public void setName(String name) {
        this.name = name;
    }
*/

    public String getDesc() {
        return desc;
    }

/*
    public void setDesc(String desc) {
        this.desc = desc;
    }
*/

    @Override
    public String toString() {
        return "季节：" + getName() + "\t" +
                "特点：" + getDesc();
    }
}
/**使用关键字实现枚举见Enumeration02*/