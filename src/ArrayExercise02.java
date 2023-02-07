import java.util.Arrays;

public class ArrayExercise02 {
    public static void main(String[] args) {
        /*
//         * 求出一个int[]的最大值{4，-1，9，10，23}，并得到对应的下标
//         * */
        //建立数组
        int ArrayExercise[] = {4, -1, 25, 10, 28};
//        int maxIndex = 0;
//        //找到最大值
//        int max = ArrayExercise[maxIndex];
//        for (int i = 1; i < ArrayExercise.length; i++) {
//            if (ArrayExercise[i] >= max) {
//                max = ArrayExercise[i];
//                maxIndex = i;
//            }
//        }
//        //打印下标
//        System.out.println(maxIndex);
        //用方法调用来实现//
        int MaxIndex = findMaxIndex(ArrayExercise);
        System.out.println(MaxIndex);


    }

    private static int findMaxIndex(int[] arrayExercise) {
        int MaxIndex = 0;
        int max = arrayExercise[MaxIndex];
        for (int i = 1; i < arrayExercise.length; i++) {
            if (arrayExercise[i] >= max) {
                max = arrayExercise[i];
                MaxIndex = i;
            }
        }
        return MaxIndex;
    }

}

