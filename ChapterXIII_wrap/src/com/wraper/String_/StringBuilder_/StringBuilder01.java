package com.wraper.String_.StringBuilder_;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class StringBuilder01 {
    /**
     * 1.一个可变的字符序列。此类提供一个与StringBuffer兼容的API，但不保证同步（StringBuilder不是线程安全）。该类被设计用作StringBuffer的一个建议替换，用在字符串缓冲区被单个线程使用的时候。如果可能，建议有限采用该类，
     *  因为在大多数实现中，它比StringBuffer要快
     * 2.在StringBulider上主要操作是append和insert方法，可重载这些方法以接收任意类型的数据
     * */
    public static void main(String[] args) {
        /**
         * 1.StringBuilder 继承 AbstractStringBuilder 类
         * 2.实现了 Serializable ,说明StringBuilder 对象是可以串行化（对象可以网络编程，可以保存到文件）
         * 3.StringBuilder 是final 类，不能被继承。
         * 4.StringBuilder 对象字符序列任然是存放在其费雷AbstractStringBuilder的 char【】 value;
         *  因此，字符序列是在堆中
         * 5.StringBuilder的方法，没有做互斥处理，即没有synchronized关键字,因此在单线程的亲啊况下
         *  使用StringBuilder
         * */

    }
}
