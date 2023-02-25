package View;

import demain.House;
import service.HouseService;

import java.util.Scanner;

/*
 * 1.显示界面
 * 2.接收用户的输入
 * 3.掉用HouseService完成对房屋的各种操作
 * */
public class HouseView {
    private boolean loop = true; //控制显示菜单
    private char key;//接收用户选择
    private HouseService houseService = new HouseService(10);
    Scanner getIndex = new Scanner(System.in);


    public void listHouses() {
        System.out.println("===============房屋列表===============");
        System.out.println("编号\t\t屋主\t\t电话\t\t地址\t\t月租\t\t状态（已出租/未出租）\t\t");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
    }


    public void addHouses() {
        System.out.println("===============添加房屋信息===============");
        System.out.print("姓名:");
        String name = getIndex.next();
        System.out.print("电话:");
        String phone = getIndex.next();
        System.out.print("地址:");
        String address = getIndex.next();
        System.out.print("月租:");
        int rent = getIndex.nextInt();
        System.out.print("状态：");
        String state = getIndex.next();
        House house = new House(0, name, phone, address, rent, state);
        if (houseService.add(house)) {
            System.out.println("===============添加房屋成功===============");

        } else {
            System.out.println("===============添加房屋失败===============");
        }


    }


    public void delHouses() {
        System.out.println("===============删除房屋信息===============");
        System.out.print("请输入待删除的房屋的编号（-1）：");
        int delId = getIndex.nextInt();
        if (delId == -1) {
            System.out.println("===============放弃删除房屋信息===============");
            return;
        }
        System.out.println("请确认是否删除（Y/N）");
        char choice = getIndex.next().charAt(0);
        if (choice == 'Y' || choice == 'y') {
            if (houseService.del(delId)) {
                System.out.println("===============删除房屋信息成功===============");

            } else {
                System.out.println("===============删除房屋信息失败===============");
            }
        } else if (choice == 'N' || choice == 'n') {
            System.out.println("===============放弃删除房屋信息===============");
        } else {
            System.out.println("输入有误");
        }
    }
    public void exitSystem(){

        System.out.print("请确认您是否退出（Y/N）:");
        char exitIndex = getIndex.next().charAt(0);
        if (exitIndex == 'Y' || exitIndex == 'y') {
            loop = false;
            return;
        } else if (exitIndex == 'N' || exitIndex == 'n') {
            loop = true;
            return;
        } else {
            System.out.println("输入非法");
        }
        loop = false;
    }
    public void Find(){
        System.out.println("\"===============查找房屋信息===============");
        System.out.print("请输入您需要查找的房屋的编号：");
        int findId=getIndex.nextInt();
        houseService.FindHouse(findId);


    }

    public void reviseHouse(){
        System.out.println("===============修改房屋信息===============");
        System.out.print("请输入您需要修改的房屋id:");
        int Reid= getIndex.nextInt();
        System.out.println("请输入您需要修改的房屋信息");
        System.out.print("姓名:");
        String name = getIndex.next();
        System.out.print("电话:");
        String phone = getIndex.next();
        System.out.print("地址:");
        String address = getIndex.next();
        System.out.print("月租:");
        int rent = getIndex.nextInt();
        System.out.print("状态：");
        String state = getIndex.next();
        House Rehouse = new House(0, name, phone, address, rent, state);
        if(houseService.reviseHouse(Rehouse,Reid)){
            System.out.println("修改成功");
        }else{
            System.out.println("很遗憾修改失败");
        }
    }

    public void mainMenu() {
        do {
            System.out.println("------------房屋出租系统-------------");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 源");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.println("请输入你的选择（1-6）");
            key = getIndex.next().charAt(0);
            if (key == '1' || key == '2' || key == '3' || key == '4' || key == '5' || key == '6') {
                switch (key) {
                    case '1':
                        addHouses();
                        break;
                    case '2':
                        Find();
                        break;
                    case '3':
                        delHouses();
                        break;
                    case '4':
                        reviseHouse();
                        break;
                    case '5':
                        listHouses();
                        break;
                    case '6':
                        exitSystem();
                        break;

                }
            } else System.out.println("你输入选项不符合规范请从新输入");
        } while (loop);
    }
}
