/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class HomeWork02 {
    public static void main(String[] args) {

    }
}
class  Frock{
    private  static  int currentNum=100000;  //衣服序列号起始值
    private int seriaNumber;
    public static int getNextNum(){
        return currentNum+=100;
    }

    public Frock() {
        seriaNumber=getNextNum();
    }

    public int getSeriaNumber() {
        return seriaNumber;
    }
}
class TestFrock{
    public static void main(String[] args) {

        //第一次调用
        Frock.getNextNum();
        //第二次调用
        Frock.getNextNum();
        //风别创建三个Frock对象，并打印三个序列号
        Frock frock = new Frock();
        System.out.println(frock.getSeriaNumber());
        Frock frock1 = new Frock();
        System.out.println(frock1.getSeriaNumber());
        Frock frock2 = new Frock();
        System.out.println(frock2.getSeriaNumber());


    }
}
