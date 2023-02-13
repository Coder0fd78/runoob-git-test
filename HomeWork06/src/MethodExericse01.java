import java.util.Scanner;

public class MethodExericse01 {
    public static void main(String[] args) {
        AA aa = new AA();
        System.out.println("请输入需要判断的数");
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        System.out.println(aa.JudgeParity(A));
        char c='*';
        aa.printChar(5,5,c);
        person p=new person();
        p.name="小白";
        p.age=18;
        Mytools mytools=new Mytools();
        mytools.tool(p);
        person p2= mytools.tool(p);
        System.out.println(p2.name+p2.age);
        System.out.println(p.name+p.age);
        System.out.println(p==p2);

    }

}

class AA {
    public boolean JudgeParity(int n) {
        return n % 2 != 0;
    }

    public void printChar(int row, int Col, char c1) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < Col; j++) {
                System.out.print(c1);
            }
            System.out.println();
        }

    }

}
class person{
    String name;
            int age;

}
class Mytools{
    public person tool (person p1){
        person p2=new person();
        p2.age= p1.age;
        p2.name= p1.name;
        return p2;
    }
}