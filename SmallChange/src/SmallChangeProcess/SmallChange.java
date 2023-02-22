package SmallChangeProcess;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChange {
    public static void main(String[] args) {
        boolean loop = true;
        String key = "";
        Scanner GetKey = new Scanner(System.in);
        String detial = "--------------零钱通明细---------------";

        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm");

        String place;
        double Consumption = 0;

        String jud;

        do {
            System.out.println("==============零钱通菜单===============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消   费");
            System.out.println("\t\t\t4 退   出");
            System.out.println("请选择（1-4）： ");
            key = GetKey.next();
            switch (key) {
                case "1":
                    System.out.println(detial);
                    break;
                case "2":
                    System.out.println("收益入账");
                    System.out.println("收益入账的金额：");
                    money = GetKey.nextInt();
                    if (money <= 0) {
                        System.out.println("你输入的金额错误");
                        break;
                    } else {
                        balance += money;
                        date = new Date();
                        detial += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
                    }
                    break;
                case "3":
                    System.out.println("消费");
                    System.out.println("请输入消费地点：");
                    place = GetKey.next();
                    System.out.println("请输入消费金额：");
                    Consumption = GetKey.nextInt();
                    if (Consumption < 0 && balance > Consumption) {
                        balance += Consumption;
                        date = new Date();
                        detial += "\n" + place + "\t" + Consumption + "\t" + sdf.format(date) + "\t余额" + balance;
                    } else {
                        System.out.println("您输入有误或者您的余额不足");
                        break;
                    }

                    break;
                case "4":

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
                    break;
                default:
                    System.out.println("菜单选择有误");
            }
        }
        while (loop);
        System.out.println("系统已退出....");
    }
}
