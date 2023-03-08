package com.wraper.Arraysort_;

import java.util.Arrays;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class ArrayCustome {
    public static void main(String[] args) {
    int []arr={-1,1,2,-8,9,10,-7};
        BubblingSort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
               int n1= new Integer((Integer) o1);
               int n2= new Integer((Integer) o2);
               return n2-n1;
            }
        });
        System.out.println("=====定制排序=====");
        System.out.println(Arrays.toString(arr));
    }
    public static  void BubblingSort(int [] arr,Comparator c){
        int temp=0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (c.compare(arr[j],arr[j+1])>0) {
                    temp = arr[j ];
                    arr[j ] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    interface Comparator{
        public int compare(Object o1,Object o2);
    }
}
