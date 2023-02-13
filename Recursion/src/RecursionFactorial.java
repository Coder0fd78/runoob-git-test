public class RecursionFactorial {
    public int test02(int n){
        if(n==1){
            return 1;
        }else {
            return test02(n-1)*n;
        }
    }
}
