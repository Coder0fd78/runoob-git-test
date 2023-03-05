package com.exception.Exercise;

import java.util.Scanner;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class Exercise01 {
    /**
     * 如果用户输入的不是整数就提示它输入整数为止
     * */
    public static void main(String[] args) {
        Exercise01 exercise01 = new Exercise01();
//        exercise01.getInt();
        exercise01.St();
    }
    //这是我的代码
//    public void getInt(){
//        boolean type=true;
//        Scanner scanner = new Scanner(System.in);
//        do{
//            try {
//                int num=scanner.nextInt();
//            } catch (Exception e) {
//                System.out.println("您输入的不是整数，请重新输入");
//              getInt();
//            }
//            type=false;
//        }while (type);
//    }
    //这是老师的代码：
    public void St(){
        Scanner scanner = new Scanner(System.in);
        int num=0;
        String inputStr="";
        while (true){
            System.out.println("请输入一个整数：");
            inputStr=scanner.next();
            try {
                num=Integer.parseInt(inputStr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("您输入的不是整数");
            }
        }
    }
}