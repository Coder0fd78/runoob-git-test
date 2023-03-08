package com.wraper.Arraysort_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class ArrayExercise01 {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("金瓶梅", 90);
        books[2] = new Book("青年文摘", 5);
        books[3] = new Book("Java从入门到放弃-", 300);

        //定制化价格排序
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book n1=(Book) o1;
                Book n2=(Book) o2;
                double pv=n1.getPrice()-n2.getPrice();
                if(pv>0){return -1;}
                if(pv<0){return 1;}
                else return 0;
            }
        });
        System.out.println("===定制化价格排序===");
        System.out.println(Arrays.toString(books));
        //定制化名字长度排序
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1,Object o2) {
                Book t1=(Book) o1;
                Book t2=(Book) o2;
                return t1.getName().length()-t2.getName().length();
            }
        });
        System.out.println("=== //定制化名字长度排序===");
        System.out.println(Arrays.toString(books));
    }
}
class Book{
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "书名："+getName()+"  价格"+getPrice()+"\t";
    }
}