package EnumExercis;

import java.util.Arrays;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class Exercise02 {
    public static void main(String[] args) {
        System.out.println("===星期如下==");
//        System.out.println(Arrays.toString(Week.values()));
        Week[] weeks=Week.values();
        for(Week week:weeks){
            System.out.println(week);
        }

    }
}
enum Week{
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期天");
    private String dec;

    Week(String dec) {
        this.dec = dec;
    }

    @Override
    public String toString() {
        return dec;
    }
}
