import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {
        method tool=new method();
        System.out.println("请输入你需要求和的两个整数：");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int Res=tool.GetSum(a,b);
        System.out.println(Res);
    }
}
