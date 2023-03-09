package HomeWork_;

import java.util.Locale;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class HomeWork03 {
    public static void main(String[] args) {
        String s="Luo jun Wei";
        printName(s);
    }
    public static void printName(String str){
        if(str==null){
            return;
        }
        String[] strArray=str.split(" ");
        if(strArray.length!=3){
            return;
        }
        String format = String.format("%s,%s .%c" , strArray[2], strArray[0], strArray[1].toUpperCase(Locale.ROOT).charAt(0));
        System.out.println(format);

    }
}
