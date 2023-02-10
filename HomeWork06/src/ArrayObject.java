import java.util.Scanner;

public class ArrayObject {
    public static void main(String[] args) {
        //在一个升序数组中插入新元素，并保持原来顺序。
        int[] arr={13,21,45,67,83};  //定义数组
        int insertNum=0;    //定义插入的值
        int index=-1;       //定义标识
        //从键盘读取需要插入的值
        Scanner insert =new Scanner(System.in);
        System.out.print("请输入你需要扩容的元素：\t");
        insertNum=insert.nextInt();
        //获取需要插入的下标
        for(int i=0;i<arr.length;i++){
            if(arr[i]>insertNum){
                index=i;
                break;
            }else {
                index=arr.length;
            }
        }
        System.out.println(index);
        //实现扩容
        int [] arrNew=new int[arr.length+1];
        for(int i=0,j=0;i<arrNew.length;i++){
            if(i!=index){
                arrNew[i]=arr[j];
                j++;
            }else{
                arrNew[i]=insertNum;
            }
        }
        for(int i=0;i<arrNew.length;i++){
            System.out.print(arrNew[i]+"\t");
        }
    }
}
