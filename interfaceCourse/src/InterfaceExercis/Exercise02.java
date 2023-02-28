package InterfaceExercis;

public class Exercise02 {
    public static void main(String[] args) {

    }
}
interface q{
    int x=0;        //==>public static final int x=0;
}
class w{
    int x=1;
}
class e extends w  implements q{
    public void px(){
        System.out.println(q.x);//接口的x
        System.out.println(super.x);//父类的x
    }

    public static void main(String[] args) {
        new e().px();
    }
}
