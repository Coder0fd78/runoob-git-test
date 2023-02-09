public class BubblingSorting {
    public static void main(String[] args) {
        /*
         * 冒泡排序
         * */
        int arr[] = {24, 89, -15, 55, 87, 36, 41, 11, 28};
        //第一轮
        int temp = 0; //中间值
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }


            }
            System.out.println("====第" + i + "轮排序====");
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");

            }
            System.out.println();
        }
    }
}
