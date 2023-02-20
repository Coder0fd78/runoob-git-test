package Poly.AnimalFeed;

public class Poly01 {
    public static void main(String[] args) {
        /*==========由此看出一旦动物很多那么就得写很多个feed方法重载=========特别麻烦===那么就引出了我们的多态====*/
        /*而且不利于代码的维护*/
        Master master = new Master("汤姆-");
        //给小狗喂食
        Dog dog = new Dog("小白-");
        Bone bone = new Bone("大骨头");
        master.feed(dog,bone);
        //给小猫喂食
        Cat cat = new Cat("小花-");
        Fish fish = new Fish("小黄鱼");
        master.feed(cat,fish);
        /*
        * 多态的基本介绍：
        * 方法或对象具有多种形态，是面向对象的第三大特征，多态是建立在封装和继承的基础之上的
        * 多态的具体体现：
        * 1.方法的多态:见包MethodEmbodiment
        * */
        Pig pig = new Pig("小黑");
        Rice rice = new Rice("米饭");
        master.feed(pig,rice);
    }
}
