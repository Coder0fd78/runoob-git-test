package EnumMethod;
/**
 * @version 1.0
 * @autor LuoJunwei
 */

/**
 * 演示Enum类常用的方法的使用
 */
public class EnumMethod {
    public static void main(String[] args) {
        //以使用Season2枚举类，来演示
        Season2 autumn = Season2.AUTUMN;
        //输出枚举对象的名字
        System.out.println(autumn.name());
        //ordinal()输出的是该枚举对象的次序/编号，从0开始编号
        System.out.println(autumn.ordinal());
        /*
        values方法，返回SEASON2[]含有定义的所有枚举对象
        增强for循环 将右边数组的内容依次给左边变量
        eg:
                int nums[]={1,2,3,45,6};
                for(int i:nums){
                    System.out.println(i);
                }
        */
        for (Season2 season2 : Season2.values()) {
            System.out.println(season2);
        }
        //valueOf:将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报错
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        //compareTo,比较两个枚举常量，比较的就是编号
        //public final int compareTo(E o) {
        //        Enum<?> other = (Enum<?>)o;
        //        Enum<E> self = this;
        //        if (self.getClass() != other.getClass() && // optimization
        //            self.getDeclaringClass() != other.getDeclaringClass())
        //            throw new ClassCastException();
        //        return self.ordinal - other.ordinal;          /（用前一个的编号-后一个的编号）
        //    }
        System.out.println(Season2.AUTUMN.compareTo(Season2.SPRING));
        //                  就是把这个的编号        和           这个的编号比较     所以这里输出的是AUTUMN的编号-SPRING的编号=3

    }
}

//以使用Season2枚举类，来演示
enum Season2 {
    SPRING("春天", "温暖"), WINTER("冬天", "寒冷"), SUMMER("夏天", "炎热"), AUTUMN("秋天", "凉爽");
    private String name;
    private String desc;
    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    private Season2() {
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