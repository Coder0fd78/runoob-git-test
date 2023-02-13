public class RecursionExercise01 {
    public int Fibonacci(int n) {
        if (n>=1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return Fibonacci(n - 1) + Fibonacci(n - 2);
            }

        }else
            System.out.println("输入是有错误的");
        return 0;
    }
}