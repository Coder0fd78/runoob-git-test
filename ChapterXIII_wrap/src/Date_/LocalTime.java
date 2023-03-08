package Date_;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class LocalTime {
    /**第三代日期时间*/
    public static void main(String[] args) {
        /**面试问Date和Calendar存在的问题
         * 1.可变性：像日期和时间这样的类应该是不可变的
         * 2.偏移性：Date中的年份是从1900开始的，而月份都从0开始
         * 3.格式化：格式化只对Date有用，Calendar则不行
         * 4.此外，他们也不是线程安全的；不能处理闰秒等（每隔两年，多出1s）*/
        //LocalDate(年月日)，LocalTime(时分秒)，LocalDateTime(年月日时分秒)
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime);
        dateTime.getYear();//....年月日时分秒都可以get到
        //定制化
        //使用DateTimeFormat
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyy年MM月dd日 HH小时mm分ss秒");
        String format = dateTimeFormatter.format(dateTime);
        System.out.println("格式化的日期："+format);
        //Instant 时间戳
        Instant now=Instant.now();  //返回当前日期的Instant
        System.out.println(now);
        //转换成Date
        Date date=Date.from(now);
        //转回去
        Instant i=date.toInstant();
        //还有很多方法：MonthDay:检查重复事件，是否闰年，增加日期的某个部分，使用plus方法测试增加时间的某个部分...
        //看看899天后
        LocalDateTime localDateTime=dateTime.plusDays(890);
        System.out.println("890天后："+dateTimeFormatter.format(localDateTime));

        //看看在十分钟前是什么时候
        LocalDateTime localDateTime1=dateTime.minusMinutes(10);
        System.out.println("十分钟前："+dateTimeFormatter.format(localDateTime1));
    }
}
