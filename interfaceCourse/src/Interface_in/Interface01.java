package Interface_in;

public class Interface01 {


    public static void main(String[] args) {
//        Interface_in.cry();
//
//        A a = new A();
//        a.hi();
//        a.hello();
        computer computer = new computer();
        Camera camera = new Camera();
        phone phone = new phone();
        computer.work(camera);
        computer.work(phone);


    }
}
