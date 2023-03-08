package BigDecimal_;

import java.math.BigDecimal;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class BigDecimal_ {
    /**超级高精度保存和运算*/
    public static void main(String[] args) {
        BigDecimal decimal=new BigDecimal("18.333333333333333333333333333333333");
        System.out.println(decimal);
        //它和BigInteger一样运算需要用自带的方法

        BigDecimal decimal1 = new BigDecimal("2.3333335555555554444444444448888888888888");
        //加法
        BigDecimal add=decimal.add(decimal1);
        System.out.println(add);
        //减法
        BigDecimal sub=decimal.subtract(decimal1);
        System.out.println(sub);
        //乘法
        BigDecimal mul=decimal.multiply(decimal1);
        System.out.println(mul);
        //除法
        BigDecimal div=decimal.divide(decimal1);

        //当是无限循环小数时 只需要在调用divide方法时指定一个精度
        BigDecimal div1=decimal.divide(decimal1,BigDecimal.ROUND_CEILING);
    }
}
