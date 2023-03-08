package com.wraper.System_;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class SystemMethod {
    /**System 常用的方法*/
    public static void main(String[] args) {
        //退出当前程序
        System.exit(0);
        //arraycopy:复制数组元素，比较适合底层调用，一般使用Arrays.copyOF完成数组复制
        int []src={1,2,3};
        int []dest=new int[3];

//        src – the source array.   源数组
//        srcPos – starting position in the source array.       从源数组的哪个索引位置开始拷贝
//        dest – the destination array.     目标数组，即把源数组的数组拷贝到哪个数组
//        destPos – starting position in the destination data.  把原数组的数据拷贝到哪个索引
//        length – the number of array elements to be copied.   从原数组拷贝多少个数据到目标数据
        System.arraycopy(src,0,dest,0,3);
        System.out.println(System.currentTimeMillis());//返回当前时间距离1970-1-1的毫秒数
        System.gc();//运行垃圾回收机制
    }
}
