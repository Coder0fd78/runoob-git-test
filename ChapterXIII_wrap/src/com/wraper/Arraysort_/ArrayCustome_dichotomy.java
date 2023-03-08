package com.wraper.Arraysort_;

import java.util.Arrays;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class ArrayCustome_dichotomy {
    public static void main(String[] args) {
        //定义一个待排序的整数数组
        int[] arr = {5, 3, 8, 6, 4, 7, 9, 2};
        //打印原始数组
        System.out.println("原始数组：" + Arrays.toString(arr));
        //调用二分排序方法
        //实现定制化
        binarySort(arr, new Comparator1() {
            @Override
            public int compare(Object o1, Object o2) {
                int n1= new Integer((Integer) o1);
                int n2= new Integer((Integer) o2);
                return n1-n2;
            }
        });
        //打印排好序后的结果
        System.out.println("排好序后：" + Arrays.toString(arr));


    }
        //定义一个二分排序方法
        public static void binarySort(int[] arr,Comparator1 comparator1) {
            //调用辅助方法进行递归操作
            sort(arr, 0, arr.length - 1,comparator1);
        }

        //定义一个辅助方法用于递归操作
        public static void sort(int[] arr, int start, int end,Comparator1 c) {
            //判断是否需要继续操作
            if (start < end) {
                //计算中间位置
                int mid = (start + end) / 2;
                //对左半部进行递归操作
                sort(arr, start, mid,c);
                //对右半部进行递归操作
                sort(arr, mid + 1, end,c);
                //合并两个有序子序列
                merge(arr, start ,mid ,end,c);
            }
        }

        //定义一个合并子序列方法
        public static void merge (int[] arr,int start,int mid,int end,Comparator1 c2){
//定义三个变量表示左半部分的起始位置、右半部分的起始位置和临时数组的当前位置
            int left = start;
            int right = mid + 1;
            int index = 0;
//定义一个临时数组用于存放合并后的结果
            int[] temp = new int[end - start + 1];
//使用一个循环，在左右两部分都有元素时执行以下步骤
            while (left <= mid && right <= end) {
                //比较左右两部分当前位置的元素大小，并将较小者放入临时数组中，并更新相应变量
                if (c2.compare(arr[left] , arr[right])>0) {       //c.compare(arr[j],arr[j+1])>0
                    temp[index] = arr[left];
                    left++;
                } else {
                    temp[index] = arr[right];
                    right++;
                }
                index++;
            }
//使用另一个循环，在左半部分还有元素时执行以下步骤
            while (left <= mid) {
                //将左半部分当前位置的元素放入临时数组中，并更新相应变量
                temp[index] = arr[left];
                left++;
                index++;
            }
//使用另一个循环，在右半部分还有元素时执行以下步骤
            while (right <= end) {
                //将右半部分当前位置的元素放入临时数组中，并更新相应变量
                temp[index] = arr[right];
                right++;
                index++;
            }
//将临时数组中存放的结果复制到原来要排序的数组中
            for (int i = 0; i < temp.length; i++) {
                arr[start + i] = temp[i];
            }
        }


}
interface Comparator1{
    public int compare(Object o1,Object o2);
}


