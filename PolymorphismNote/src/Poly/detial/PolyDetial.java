package Poly.detial;

public class PolyDetial {
    public static void main(String[] args) {
        //======================向上转型：父类的引用指向子类对象======================
        Animal animal = new Cat();
        //语法： 父类引用名=new 子类类型（）;
        Object obj=new Cat();
        //特点：编译类型看左边，运行类型看右边
        //可以调用父类中的所有成员（需要遵守访问权限）
        //不能调用子类特有成员
        //最终运行看子类的具体实现 ，即调用方法时，按照子类开时查找方法，然后调用，规则和前面this.cal和super().cal一样
        //animal.就调用不了CatMouse方法，因为在编译阶段能调用哪些成员是由编译类型来决定的
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();
        //=====================向下转型：子类类型 引用名=（子类类型） 父类引用；======================
        //  编译类型  运行类型 都是Cat
        Cat cat=(Cat) animal;   //因为在编译阶段都进行了编译所以运行也能运行
        //这样就可以掉用子类特有的成员
        ((Cat) animal).catMouse();//animal.catMouse 相当于强制转换
        //只能强转父类的引用，不能强转父类的对象
        //要求父类引用必须指向的时当前目标类的对象：也就是前提是：Animal animal =new Car(); 可以理解为：父类引用必须指向new的运行类的对象
        //当向下转型后，可以掉用子类类型中的所有成员
    }
}
