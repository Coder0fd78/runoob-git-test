import java.util.Scanner;

public class YangHui {
    public static void main(String[] args) {
        //输出?行杨辉三角形
        //1
        //11
        //121
        //1231
        //...
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你需要打印的三角形的行数：");
        int Count = sc.nextInt();

        int[][] arr = new int[Count][];
        for (int i = 0; i < arr.length; i++) {
            //给每一个数组（行)开辟空间
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                //每一行的第一个和最后一个元素都是一
                if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                } else {
                    //中间的数等于上一行前面一个加对应列的数
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
}

