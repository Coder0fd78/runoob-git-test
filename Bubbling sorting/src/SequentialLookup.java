import java.util.Scanner;

public class SequentialLookup {
    public static void main(String[] args) {
        String[] names = {"紫衫龙王", "白眉鹰王", "青翼蝠王", "金毛狮王"};
        //从键盘键入需要查找的目标
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您需要查找的目标：");
        String findString = sc.next();
        //顺序查找目标
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(findString)) {
                System.out.println("已经找到目标" + names[i]);
            }
        }


    }
}
