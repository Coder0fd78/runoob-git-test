package Date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class Date_ {
    /**第一代日期的表示*/
    public static void main(String[] args) throws ParseException {
        Date date=new Date();   //获取当前系统时间（java.util）
        //默认时国外的，所以要转换格式
        SimpleDateFormat sdf= new SimpleDateFormat("yyy年MM月dd日 hh:mm:ss E");

        Date date2=new Date(925453);    //通过指定毫秒数得到时间
        String f=sdf.format(date2);
        System.out.println("d2="+f);//获取某个时间对应的毫秒数
        //1.可以把一个格式化的String 转成对应Date
        //2.得到Date 仍然在输出时，还是按照国外的形式，如果希望指定格式输出，需要转换
        //3.把String ->Date 使用的sdf格式需要和你给的String 的格式一样，否则会抛出转换异常
        String s="1996年01月01日 10:20:30 星期一";
        Date p=sdf.parse(s);
        System.out.println("p="+sdf.format(p));
    }
}
