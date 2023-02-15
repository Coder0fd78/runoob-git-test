public class OverLoadTest {
    public static void main(String[] args) {
        //OverLoad
        T test = new T();
        test.OverLoad(25, 45);
        test.OverLoad(27.3, 29.2);
        test.OverLoad("小煞笔");
        //VariadicParameters
        VariadicParameters variadicParameters = new VariadicParameters();
        variadicParameters.variadicParameters("小煞笔", 88.9, 58.7, 77.6, 93.5, 97.4, 86.4);
    }
}

class T {
    public int OverLoad(int a, int b) {
        System.out.println("调用了两个整数的方法");
        System.out.println(a + b);
        return a + b;
    }

    public double OverLoad(double a, double b) {
        System.out.println("调用了两个double的方法");
        System.out.println(a + b);
        return a + b;
    }

    public String OverLoad(String b) {
        System.out.println("调用了字符串的方法");
        System.out.println(b);
        return b;
    }
}
