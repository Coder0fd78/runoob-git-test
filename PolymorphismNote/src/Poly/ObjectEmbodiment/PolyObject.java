package Poly.ObjectEmbodiment;

public class PolyObject {
    //对象的多态是核心
    /*
    * 1.一个对象的编译类型和运行类型可以不一致  eg: Animal animal =new Dog()  父类的引用可以指向子类的对象，他的编译类型是Animal
    * 他的运行类型是Dog
    * 2.编译类型在定义对象时，就确定了，不能改变
    * 3.运行类型时可以变化的
    * 4.编译类型看定义时=号的左边，运行类型看=号都右边 eg:Animal animal =new Cat() animal的运行类型变成了Cat,编译类型任然时Animal
    * */
    public static void main(String[] args) {
        //  编译类型           运行类型
        Animal animal = new Animal();
        animal.say();
        animal=new Cat();
        animal.say();//因为运行时，执行到该行时，animal的运行类型时Cat,所以say就是Cat的say
        animal=new Dog();
        animal.say();//因为运行时，执行到该行时，animal的运行类型时Dog,所以say就是Dog的say
    }
}
