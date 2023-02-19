package ExtendsTheory;
/*
* 继承的本质
* */
public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        /*
        * 对象的创建过程：
        * 1.加载类：Object->Grandpa->Father->Son
        * 2.在堆中生成地址空间：爷爷：name ->常量池 ；hobby ->常量池 ；爸爸(新开空间)：name ->常量池 ；age (基本数据类型直接放堆里)；
        *   儿子(新开空间)：name ->常量池。
        * */
        System.out.println(son.name);//大头儿子
        //?->son.name返回规则：
        /*
         * （1） 首先看子类是否具有该属性
         * （2） 如果子类有这个属性，可以访问，则返回信息
         * （3） 如果子类没有这个属性，就看父类有没有这个属性（如果父类有这个属性，并且可以访问，就返回信息..）
         * （4） 如果父类没有这个属性就按照（3）的规则，继续找上级父亲，知道Object为止
         * */
        System.out.println(son.age);//继承而来的大头爸爸的年龄39
        System.out.println(son.hobby);//继承而来的大头爷爷的爱好
    }
}
class Grandpa{//爷爷类
    String name="大头爷爷";
            String hobby="旅游";
}
class Father extends Grandpa{//父类
    String name="大头爸爸";
    int age=39;
}
class Son extends Father{//子类
    String name="大头儿子";

}