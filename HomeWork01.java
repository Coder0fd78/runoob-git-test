public class HomeWork01{
 public static void main(String[] args) {
	//ĳ����100000Ԫ��ÿ�ξ���һ��·�ڣ���Ҫ�ɷѣ��������£�
 	//1�����ֽ����50000ʱÿ�ν�5%
 	//2�����ֽ�С�ڵ���50000ʱÿ�ν�1000
 	//��̼�����˿��Ծ������ٴ�·�ڣ�Ҫ��ʹ��while+break���


 	//����money����100000;���������count
 	double money=100000;
 	int count=0;
 	//������Ŀ����ʵ�ָ�������
 	while(true){
 		if��money>50000��{
 			money-=money*0.05;
 			count++;
 		}else if(money>=1000&&money<=50000){
 			money-=1000;
 			count++;
 		}else{
 			break;
 		}
 	}
 	//��ӡ�����
 	System.out.println(count);
 }
}
