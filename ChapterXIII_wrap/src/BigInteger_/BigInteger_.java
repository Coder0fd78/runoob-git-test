package BigInteger_;

import java.math.BigInteger;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class BigInteger_ {
    public static void main(String[] args) {
        /**用于超大数据的存储和运算*/
        BigInteger bigInteger=new BigInteger("1232154654654654654654654");
        System.out.println(bigInteger);
        //注意，它的加减乘除不能直接运算，需要用BigInteger的方法
        //例如：
        BigInteger bigInteger1=new BigInteger("21561616515616466515");
        //加法：
        BigInteger add=bigInteger.add(bigInteger1);
        System.out.println(add);
        //除法
        BigInteger sub=bigInteger.subtract(bigInteger1);
        System.out.println(sub);
        //同理....
    }
}
