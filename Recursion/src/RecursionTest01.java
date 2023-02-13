public class RecursionTest01 {
    public void test(int n) {
        if (n > 2) {
            test(n - 1);
        }
        System.out.print("n=" + n+"\t");


    }

}
