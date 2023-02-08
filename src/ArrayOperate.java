import java.util.Scanner;

public class ArrayOperate {
    public static void main(String[] args) {
        int arr[] = {11, 22, 33, 44, 55, 66};
        //数组的拷贝
//        int []arr2=new int[arr.length];
//        for(int i=0;i<=arr.length;i++){
//            arr2[i]=arr[i];
//            System.out.print(arr2[i]+" ");
//        }
        //数组的翻转
//        int temp=0;
//        int count=arr.length;
//        for(int j=0;j<=arr.length/2;j++){
//            temp=arr[count-1-j];
//            arr[count-1-j]=arr[j];
//            arr[j]=temp;
//            System.out.print(arr[j]+" ");
//        }
        //逆序遍历的方法
//        int arr2[]=new int[arr.length];
//        for(int i=arr.length-1,j=0;i>=0;i--,j++){
//            arr2[j]=arr[i];
//        }
//        arr=arr2;
//        for(int i=0;i<=arr.length-1;i++){
//            System.out.print(arr[i]+" ");
//        }
        //数组的扩容
//        int[] arrNew = new int[arr.length + 1];
//        for (int i = 0; i < arr.length; i++) {
//            arrNew[i] = arr[i];
//        }
//        arrNew[arrNew.length - 1] = 77;
//        arr = arrNew;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
        //数组的动态扩容
        Scanner sc = new Scanner(System.in);
//        do {
//            int[] arrNew = new int[arr.length + 1];
//            for (int i = 0; i < arr.length; i++) {
//                arrNew[i] = arr[i];
//            }
//            System.out.println("请输入你需要添加的数：");
//            int addInt = sc.nextInt();
//            arrNew[arrNew.length - 1] = addInt;
//            arr = arrNew;
//            for (int i = 0; i < arr.length; i++) {
//                System.out.println(arr[i]);
//            }
//            System.out.print("是否需要继续添加Y/N： ");
//            char addOperate = sc.next().charAt(0);
//            if (addOperate == 'N') {
//                System.out.println("扩容结束...");
//                break;
//            }
//            if (addOperate != 'Y' && addOperate != 'N') {
//                System.out.println("非法输入");
//                break;
//            }
//
//        } while (true);
        //数组的动态缩减
        do {
            int[] DeleteArray = new int[arr.length - 1];
            for (int i = 0, j = 0; i < DeleteArray.length; i++, j++) {
                DeleteArray[i] = arr[j];
            }
            arr = DeleteArray;
            for (int k = 0; k < arr.length; k++) {
                System.out.println(arr[k] + " ");
            }
            System.out.println("是否继续缩减Y/N");
            char addOperate = sc.next().charAt(0);
            if (addOperate == 'N') {
                System.out.println("缩减结束...");
                break;
            }
            if (addOperate != 'Y' && addOperate != 'N') {
                System.out.println("非法输入");
                break;
            }
        } while (true);

    }

}
