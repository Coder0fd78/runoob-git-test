package com.exception.homeWork;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class HomeWork01 {
    public static void main(String[] args) {
        double res = 0;
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不正确");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            res = cal(n1, n2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确");
        } catch (ArithmeticException e) {
            System.out.println("被除数不能为0");
        }
        System.out.println("n1/n2=" + res);
    }

    public static double cal(int n1,int n2){
        return n1/n2;
    }
}
