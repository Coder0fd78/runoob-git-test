public class VariadicParameters {
    public void variadicParameters(String b, double... a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(b + "的" + a.length + "科成绩和为：" + sum);
    }
}
