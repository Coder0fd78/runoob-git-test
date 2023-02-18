package com.ljwjava.encap;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        //设置变量从键盘接收信息
        String name;
        double balance;
        String password;
        System.out.println("请你输入用户信息");
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        balance = scanner.nextDouble();
        password = scanner.next();
        //new一个account对象并传入从键盘输入的信息将其实例化
        Account account = new Account(name, balance, password);
        System.out.println("=======您的用户信息如下========");
        //输出判断后的信息
        System.out.println(account.show());
    }
}
