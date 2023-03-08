package Date_;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Calendar;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class Calender_ {
    //1.Calendar是一个抽象类，并且构造器是private
    //2.可以通过getInstance()来获取实例
    //3.提供了很多方法

    //直接通过对象获取
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance(); //不能new 直接用就行
        System.out.println(c.get(Calendar.MONTH));//这样直接就能获取月
        //Calendar没有专门提供格式化方法，所以需要程序员自己组合，相比Date很自由
   //如果我们需要用24小时
        System.out.println(c.get(Calendar.HOUR_OF_DAY));    //这样就是24小时制
    }
}
