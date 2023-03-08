package HomeWork_;

import java.util.Arrays;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class HomeWork01 {
    public static void main(String[] args) {
        String str="asdcfe";
        try {
            String ReString=reverse(str,1,5);
            System.out.println("翻转后的字符串是："+ReString);
        } catch (Exception e) {
            System.out.println("你输入是有误的");
        }

    }
    public static String reverse(String str,int start,int end){
        //4.优化判断start,end 是否合法
        if(start>end&&end<str.length()){
            throw new RuntimeException();
        }
        //1.将字符串转换成字符数组
        char[] StringArr=str.toCharArray();
        //2.交换索引为start和end的元素
        //3.进行循环 直到start=end
        char temp;
        for (int i = 0; i < end-start; i++) {
            temp=StringArr[start];
            StringArr[start]=StringArr[end];
            StringArr[end]=temp;
            start++;
            end--;
        }
//      System.out.println("翻转后的数组"+ Arrays.toString(StringArr));

        String str1=new String(StringArr);
        return str1;
    }
}
