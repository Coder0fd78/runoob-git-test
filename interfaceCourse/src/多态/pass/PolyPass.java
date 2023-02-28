package 多态.pass;

public class PolyPass {
    public static void main(String[] args) {
        ig ig1=new teacher();//接口类型的变量可以指向，实现了接口类型的类的实例对象
//        ih ih1=new teacher();//这样是错误的；如果需要这样 就ih去继承 ig 那么 就可以了
        ih ih1=new teacher();
        /**
         * 如果ig继承了ih接口，而teacher类实现了ig接口，那么实际上相当于teacher也实现了ih接口
         * 这就是所谓的多态传递现象
         *
         * */
    }
}
interface ih {}
interface ig extends ih{}
class teacher implements ig{

}
