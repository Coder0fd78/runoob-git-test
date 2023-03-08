package com.wraper.String_.StringBuffer_;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class StringBuffer_ {
    /**
     * 1.StringBuffer 的直接父类 是AbstractStringBuilder
     * 2.StringBuffer 实现了Serializable,即StringBuffer 的对象可以串行化
     * 3.在父类中，有属性 char[] valiue ，不是final
     *   该value数组存放 字符串内容，引出存放在堆中。
     * 4.StringBuffer 是一个final类，不能被继承
     * 5.因为StringBuffer字符内容是存爱char[]value，所有在变化（增加/删除）
     *   不用每次都更换地址（即不是每次创建新对象），所以他的效率高于String
     * */
    public static void main(String[] args) {
        //1.创建一个大小为16的char[],用于存放字符内容
        StringBuffer stringBuffer=new StringBuffer();
        //2通过构造器指定char[]大小
        StringBuffer stringBuffer1=new StringBuffer(100);
        //3.通过给一个String创建StringBuffer，char[]大小就是str.length()+16

        /**String->StringBuffer*/
        String str="hello tom";
        //方式一：使用构造器
        //注意：这里返回的才是StringBuffer对象，对str本身没有影响
        StringBuffer stringBuffer2 = new StringBuffer(str);
        //方法二：使用的是append方法
        stringBuffer2=stringBuffer.append(str);
       /**StringBuffer -> String */
        StringBuffer stringBuffer3 = new StringBuffer("罗均为");
        //方法一：使用StringBuffer提供的toString方法
        String s1=stringBuffer3.toString();
        //方法二：使用构造器
        String s = new String(stringBuffer3);
        /**常用的方法*/
        //增  append
        //删  删除索引为>=start && <end 处的字符 delete(>=start && <end)
        //该  replace(9,11):替换索引9-11的字符
        //查  indexOf(""):查找字符串第一吃出现的索引，如果找不到返回-1
        //插入  insert(9,"s")在索引为九的地方插入字符串s
        //长度   s.length:字符串s的长度

    }
}
