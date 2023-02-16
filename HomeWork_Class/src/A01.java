import java.util.Scanner;

//求数组的最大值
class A01 {
    double[] arr;

    public A01(double[] arr) {
        this.arr = arr;
    }

    public double max(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
//查找字符串数组中的元素
class A02 {
    String[] arrString;

    public A02(String[] arrString) {
        this.arrString = arrString;
    }

    public int find(String[] arrString) {
        int index = -1;
        System.out.println("请输入您需要查找的元素：");
        Scanner getString = new Scanner(System.in);
        String CompereString = getString.next();
        for (int i = 0; i < arrString.length; i++) {
            if (CompereString.equals(arrString[i])) {
                System.out.println("找到了对应元素" + arrString[i]);
                index = 1;
                break;
            } else {
                System.out.println("没找到对应元素");
                index = -1;
            }
        }
        return index;
    }
}

class Book{
    String BookName;
    double BookPrice;
    public Book(String BookName,double BookPrice){
        this.BookName=BookName;
        this.BookPrice=BookPrice;
    }
    public void update(){

    }


}