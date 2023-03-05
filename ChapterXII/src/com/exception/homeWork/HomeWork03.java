package com.exception.homeWork;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class HomeWork03 {
    public static void func(){
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("B");
        }
    }

    public static void main(String[] args) {
        try {
            func();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("C");
        }
        System.out.println("D");
    }
}
