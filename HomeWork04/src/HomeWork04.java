import java.util.Scanner;

public class HomeWork04 {
    public static void main(String[] args){
    /*
    * 问题分析 ：从键盘接收一个整数判断其是否为水仙花数
    * */
        //从键盘接收一个整数
        System.out.print("请输入你需要判断的数：");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        //获取n的百位，十位，个位的数，使用if判断他们的立方和是否相等
        int Hundred=n/100;
        int Ten=n%100/10;
        int Bit=n%10;
        if(Bit*Bit*Bit+Ten*Ten*Ten+Hundred*Hundred*Hundred==n){
            System.out.println(n + "是水仙花数");
        }else{
            System.out.println(n + "不是水仙花数");
        }
    }
}
