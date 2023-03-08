package com.wraper.Math_;


import java.util.Arrays;
import java.util.Comparator;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class ArraySort_ {


    public static void main(String[] args) {
        /**这里特别说明自定义排序*/
        Integer [] arr={-1,8,5};
        //普通排序
//        Arrays.sort(arr);
//        Arrays.toString(arr);
        Arrays.sort( arr , new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1=(Integer) o1;
                Integer i2=(Integer) o2;
                return i2-i1;
            }
        });
        for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i]+"\t");
        }
    }

}
