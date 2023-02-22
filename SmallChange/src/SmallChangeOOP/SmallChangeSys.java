package SmallChangeOOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    /*
     * 这个类用来实现功能
     * */
    //属性
    boolean loop = true;//循环打印菜单控制
    String key = "";//控制选择菜单
    Scanner GetKey = new Scanner(System.in);
    String detail = "--------------零钱通明细---------------";

    double money = 0;//收入
    double balance = 0;//余额
    Date date = null;//日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm");//格式化日期

    String place;//消费说明
    double Consumption = 0;//消费金额

    String jud;//判断是否退出

    //零钱菜单
    public void MainMenu() {
        do {
            System.out.println("==============OOP零钱通菜单===============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消   费");
            System.out.println("\t\t\t4 退   出");
            System.out.println("请选择（1-4）： ");
            key = GetKey.next();
            switch (key) {
                case "1":
                    this.SmallChangeDetail();
                    break;
                case "2":
                    this.info();
                    break;
                case "3":
                    this.putS();

                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("菜单选择有误");
            }
        }
        while (loop);
    }


    //明细
    public void SmallChangeDetail() {
        System.out.println(detail);
    }


    //收益
    public void info() {
        System.out.println("收益入账");
        System.out.println("收益入账的金额：");
        money = GetKey.nextInt();
        if (money <= 0) {
            System.out.println("你输入的金额错误");
            return;
        } else {
            balance += money;
            date = new Date();
            detail += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
        }
    }

    //消费

    public void putS() {
        System.out.println("消费");
        System.out.println("请输入消费地点：");
        place = GetKey.next();
        System.out.println("请输入消费金额：");
        Consumption = GetKey.nextInt();
        if (Consumption < 0 && balance > Consumption) {
            balance += Consumption;
            date = new Date();
            detail += "\n" + place + "\t" + Consumption + "\t" + sdf.format(date) + "\t余额" + balance;
        } else {
            System.out.println("您输入有误或者您的余额不足");

        }
    }

    //退出

    public void exit() {
        while (true) {
            System.out.println("你确定退出程序吗：y/n");
            jud = GetKey.next();
            if (jud.equals("y") || jud.equals("n")) {
                break;
            }
        }
        if (jud.equals("y")) {
            loop = false;
        }
    }

}
