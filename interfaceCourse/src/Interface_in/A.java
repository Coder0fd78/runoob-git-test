package Interface_in;

public class A implements Interface_in{
    public A() {
    }
    /**
     * 1.如果一个类implements实现接口，需要将该接口的所有抽象方法都实现
     * */
    @Override
    public void hi() {
        System.out.println("hi...");
    }

    @Override
    public void hello() {
        Interface_in.super.hello();
    }

}
