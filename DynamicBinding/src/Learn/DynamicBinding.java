package Learn;

/*===============动态绑定机制==========================重点！！*/
public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();  //编译类型是A 运行类型是B
//        System.out.println(a.sum()); //方法输出看运行类型：40
//        System.out.println(a.sum1());//30
        /*如果将子类的sum方法注释掉呢？System.out.println(a.sum()); 又会输出什么呢？ */
        System.out.println(a.sum()); //注释掉后，按照规则查找，子类没有sum方法，就会去找父类，父类有sum方法执行，sum方法中的GetI 子类和父类都有
        //那么执行谁的呢？
        //！！ 机制：1.当掉用对象方法时，该方法会和该对象内存地址/即运行类型绑定
        //所以 父类A 中 sum方法中的GetI 掉用的是子类B的GetI方法 所以 输出的是30
        System.out.println(a.sum1());//那么如果把子类的sum1方法注释掉 这段代码的结果是什么呢？
        //按照查找规则，子类没有sum1就会到父类查找，父类有sum1 直接执行，父类中sum1方法中 return i 这是类的属性 直接哪里声明哪里掉用 所以这个i
        //是父类的 i=10  所以 这段代码输出的是20
        //！！机制：2.当掉用对象属性时，没有动态绑定机制，哪里声明哪里掉用！！
    }
}

class A {
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int getI() {
        return i;
    }

    public int sum1() {
        return i + 10;
    }
}

class B extends A {
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

    public int getI() {
        return i;
    }

//    public int sum1() {
//        return i + 10;
//    }
}
