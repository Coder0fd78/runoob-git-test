package 多态;


public class test {
    public static void main(String[] args) {
        /**
         * 接口A可以指向实现了接口的类的对象
         *
         * */
//        A q=new a();
//        q=new b();

        /**
         * 多态数组
         * */
        usb[] usbs=new usb[2];
        usbs[0]=new phone_();
        usbs[1]=new camera();
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();//动态绑定
            if(usbs[i] instanceof phone_){//判断他的运行类型
                ((phone_) usbs[i]).call();//向下转型
            }
        }
    }
}
//interface A{
//}
//class a implements A{
//}
//class b implements A {
//}
interface usb{
    void work();
}
class phone_ implements usb{public void call(){
    System.out.println("手机可以打电话");
}

    @Override
    public void work() {
        System.out.println("手机工作中...");
    }
}
class camera implements usb{

    @Override
    public void work() {
        System.out.println("相机工作中...");
    }
}

