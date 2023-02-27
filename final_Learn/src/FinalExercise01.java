public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
    }
}
class Circle{
    private double radius;
    private final double PI=3.14; //第一种赋值方式

    {
//        PI=3.14;  //--第二种赋值方式
    }
    public Circle(double radius) {
        this.radius = radius;
//        PI=3.14;   //--第三种赋值方式
    }

    public  double getSize(double radius){
        return PI*radius*radius;
    }
}
