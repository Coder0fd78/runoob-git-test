package InnerClassCourse;
/**
 * 当作实参直接传递，简洁高效
 * */
public class Exerce01 {
    public static void main(String[] args) {
        f1(new Ai() {
            @Override
            public void say() {
                System.out.println("重写了Ai方法");
            }
        });
    }
    public static void f1(Ai ai){
        ai.say();
    }
}
interface Ai{
    public void say();
}

