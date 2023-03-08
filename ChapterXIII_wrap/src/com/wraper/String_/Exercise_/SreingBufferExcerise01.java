package com.wraper.String_.Exercise_;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class SreingBufferExcerise01 {
    public static void main(String[] args) {
        String str = "123456.6";
        StringBuffer stringBuffer = new StringBuffer(str);
        for (int i = stringBuffer.lastIndexOf(".") - 3; i > 0; i -= 3) {
            stringBuffer = stringBuffer.insert(i, ",");
        }
        System.out.println(stringBuffer);
    }
}
