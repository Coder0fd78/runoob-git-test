package Poly.AnimalFeed;

public class Master {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Master(String name) {
        this.name = name;
    }

    /*==========由此看出一旦动物很多那么就得写很多个feed方法重载=========特别麻烦===那么就引出了我们的多态====*/
    //主任给小狗喂食
//    public void feed(Dog dog, Bone bone) {
//        System.out.println("主人" + getName() + "给" + dog.getName() + "吃" + bone.getFoodName());
//    }
//
//    //主人给小猫喂食
//    public void feed(Cat cat, Fish fish) {
//        System.out.println("主人" + getName() + "给" + cat.getName() + "吃" + fish.getFoodName());
//    }
    //=======================使用多态机制可以统一管理主任喂食的问题====================
    public void feed(Animal animal,Food food){
        //animal的编译类型时Animal,可以接收Animal的子类的对象作为运行类型，同理Food也是一样
        System.out.println("主人"+name+"给"+animal.getName()+"吃"+food.getFoodName());
    }
}
