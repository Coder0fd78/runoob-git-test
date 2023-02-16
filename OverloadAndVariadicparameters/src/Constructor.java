public class Constructor {

    String name;
    int age;

//    public Constructor(String Pname, int Page) {
//        Pname=name;
//        Page=age;
//    }

    //this的使用：
    public Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
     *this 是指向他自己
     *
     *
     * */
    Constructor constructor = new Constructor("小钱", 21);
    /*
    【背下来！！！】
    * 1.加载Constructor类信息（.class），只会加载一次
    * 2.在堆中分配空间（地址）
    * 3.完成初始化
    *   【3.1】：默认初始化 String name =NULL int age =0
    *   [3.2]显示初始化 name="小白",age=18
    *   [3.3]构造器初始化 name=小钱，age=21
    * 4.在对象堆中的地址，返回给constructor(constructor是对象名，即对象的引用)
    * */
}
