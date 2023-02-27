package Abstract;

public class abstract01 {

}
abstract class   Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    //思考：这里eat，这里你实现了也没什么意义。
    //即：父类方法不确定性的问题
    //===》考虑将该方法设计为抽象方法
    //==》抽象方法就是没有实现的方法
    //==》所谓没有实现就是没有方法体
    //==》一般来说，抽象类会被继承，有其子类来实现抽象方法
//    public void eat(){
//        System.out.println("这是一个动物但是不知道吃什么");
//    }
    public abstract void eat();
    //当把方法设置为抽象方法是，类也必须成为抽象类
}
