package EnumExercis;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class EnumExercise01 {
    public static void main(String[] args) {
        Gender2 boy=Gender2.BOY;
        Gender2 boy2=Gender2.BOY;
        System.out.println(boy);
        //本质上是调用父类Enum的toString方法
//        public String toString(){
//            return name;
//        }
        //所以输入的就是BOY
        System.out.println(boy2==boy);      //true
    }
}
enum Gender2{
    BOY,GIRL
}

