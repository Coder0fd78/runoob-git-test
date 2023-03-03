/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class HomeWork04 {
    public static void main(String[] args) {
    Cellphone c=new Cellphone();
    /**
     * 匿名内部类的使用，作为一个参数传递
     * */
    c.testWork(new calculator() {
        @Override
        public void work() {
            System.out.println("计算器正在运行...");
        }
    });
    }
}
interface calculator{
    public void work();
}

class Cellphone {
    public void testWork(calculator cal){
        System.out.println(cal);
    }
}