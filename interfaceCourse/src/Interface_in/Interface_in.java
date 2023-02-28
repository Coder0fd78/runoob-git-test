package Interface_in;

public interface Interface_in {
    public void hi();
    //在JDK8后可以有默认实现方法，但是需要使用default关键字修饰
    default public void hello(){
        System.out.println("hello...");
    }
    //在jdk8后，可以有静态方法
    public static void cry(){
        System.out.println("cry...");
    }
}
