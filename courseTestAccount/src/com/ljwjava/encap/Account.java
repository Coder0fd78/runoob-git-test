package com.ljwjava.encap;

public class Account {
    //定义类的属性
    private String name;
    private double balance;
    private String passWord;

    //无参构造器
    public Account() {
    }

    //构造器
    public Account(String name, double balance, String passWord) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassWord(passWord);
    }
    //get和set 将传入的数据传给对象的属性并且进行判断

    public String getName() {
        return name;
    }

    //对传入的名字进行校验
    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("你的名字输入格式有误，以为您设置为默认值");
            this.name = "无名";
        }
    }

    public double getBalance() {
        return balance;
    }

    //对传入的余额进行校验
    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("您输入的余额不得低于20");
            this.balance = 0;
        }
    }

    public String getPassWord() {
        return passWord;
    }

    //对传入的密码进行校验
    public void setPassWord(String passWord) {
        if (passWord.length() == 6) {
            this.passWord = passWord;
        } else {
            System.out.println("密码必须为长度为6的字符串,已经为您初始化为000000");
            this.passWord = "000000";
        }
    }

    //show()方法返回给前台数据
    public String show() {
        return "name：" + this.getName() + "password: " + this.getPassWord() + "balance:" + getBalance();
    }
}
