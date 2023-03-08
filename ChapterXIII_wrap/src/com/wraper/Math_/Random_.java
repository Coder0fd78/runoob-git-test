package com.wraper.Math_;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class Random_ {
    public static void main(String[] args) {
        /**2-7的整数随机*/
        //1.（int）(a)<=x<=(int)(a+Math.random()*(b-a+1))
        //2.使用具体值：
        //（int）(2+Math.random()*6)
        //Math.random()*6返回的就是2<=x<6 的小数
        //2+Math.random()*6返回的就是2<=x<8的小数
        //公式：int num=a+Math.random()*(b-a+1)
        for (int i = 0; i < 5; i++) {
            int n=(int)(2+Math.random()*6);
            System.out.print(n+"\t");
        }
    }
}
