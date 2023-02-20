package Poly.Detial03;

public class PolyDetial03 {
    //instanceOF 比较操作符，用于判断对象的类型是否为XX类型或XX类型的子类
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof  BB); //true
        System.out.println(bb instanceof  AA); //true

        AA aa=new BB(); //编译类型AA 运行类型BB
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);
        //结论： instanceOF 用于判断对象的运行类型是否为XX类型或XX类型的在子类


    }
}

class AA {

}

class BB extends AA {

}