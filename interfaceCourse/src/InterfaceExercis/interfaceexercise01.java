package InterfaceExercis;

public class interfaceexercise01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(A.a);
        System.out.println(b.a);
    }
}
interface A{
    int a=23;
}
class B implements A{

}
