package service;

import demain.House;

/**
 * HouseService.java<=>类【业务层】
 * 定义House【】,保存house对象
 * 1.响应HouseVivew的掉用
 * 2.完成对房屋信息的各种操作
 */
public class HouseService {
    private House[] houses;
    private int HouseNums = 1;
    private int idCounter = 1;

    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(01, "刘三德", "1807", "罗浮区", 3500, "已出租");
    }

    /**
     * add
     */
    public boolean add(House newHouse) {
        if (HouseNums == houses.length) {
            System.out.println("房屋数量最大了，添加不了了");
            return false;
        }
        houses[HouseNums++] = newHouse;
        newHouse.setId(++idCounter);
        return true;

    }

    /**
     * List
     */
    public House[] list() {
        return houses;
    }

    /**
     * del
     */
    public boolean del(int delId) {
        int index = -1;
        for (int i = 0; i < HouseNums; i++) {
            if (delId == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }
        for (int i = 0; i < HouseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--HouseNums] = null;
        return true;
    }

    /**
     * 查找房屋信息
     */
    public boolean FindHouse(int findHouseId) {
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getId() == findHouseId) {
                if (houses[i] != null) {
                    System.out.println(houses[i]);
                    return true;
                } else {
                    System.out.println("很遗憾没有找到您的房屋");
                    return false;
                }
            } else {
                System.out.println("很遗憾没有找到您的房屋");
                return false;
            }
        }
        return false;
    }


    /**
     * 修改 revise
     */
    public boolean reviseHouse(House reviseHouse, int reviseId) {
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getId() == reviseId) {
                if (reviseHouse.getName() != null) {
                    houses[i].setName(reviseHouse.getName());
                }
                if (reviseHouse.getPhone() != null) {
                    houses[i].setPhone(reviseHouse.getPhone());
                }
                if (reviseHouse.getAddress() != null) {
                    houses[i].setAddress(reviseHouse.getAddress());
                }
                if (reviseHouse.getRent() != 0) {
                    houses[i].setRent(reviseHouse.getRent());
                }
                if (reviseHouse.getState() != null) {
                    houses[i].setState(reviseHouse.getState());
                }
                return true;
            }

        }
        return false;
    }
}
