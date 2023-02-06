public class HomeWork01{
 public static void main(String[] args) {
	//某人有100000元，每次经过一次路口，需要缴费，规则如下：
 	//1）当现金大于50000时每次交5%
 	//2）当现金小于等于50000时每次交1000
 	//编程计算该人可以经过多少此路口，要求使用while+break完成


 	//定义money保存100000;定义计数器count
 	double money=100000;
 	int count=0;
 	//根据题目需求实现付款的情况
 	while(true){
 		if（money>50000）{
 			money-=money*0.05;
 			count++;
 		}else if(money>=1000&&money<=50000){
 			money-=1000;
 			count++;
 		}else{
 			break;
 		}
 	}
 	//打印出结果
 	System.out.println(count);
 }
}
