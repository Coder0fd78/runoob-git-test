public class ArrayExercise {
    public static void main(String[] args) {
        /*
         * 创建一个Char类型的26个元素的数组，分别防止'A'-'Z'使用for循环访问所有元素并打印出来
         * */
        //创建一个数组并初始化
        char words[] = new char[26];
        //存入字母
        for (int i = 0; i < words.length; i++) {
            //因为‘A'+i 是int 类型，所以要char 强制转换一下。
            words[i] = (char) ('A' + i);
        }
        //打印出存入的字母
        for (int j = 0; j < words.length; j++) {
            System.out.print(words[j] + " ");
        }
    }
}
