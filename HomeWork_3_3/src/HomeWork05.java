/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class HomeWork05 {
    public static void main(String[] args) {

    new A().f1();
    }
}
class A{
    private String NAME="大傻逼";
    public void f1(){
        class B{
            private final String NAME="小白";
            public void show(){
                System.out.println("名字是："+NAME);
                System.out.println("A的名字是"+A.this.NAME);
            }
        }
        B b = new B();
        b.show();
    }
}
