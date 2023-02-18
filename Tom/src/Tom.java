import java.util.Random;
import java.util.Scanner;

public class Tom {
    public static void main(String[] args) {
        int userNum = 0;
        Scanner getUserNum = new Scanner(System.in);
        TomChat tomChat = new TomChat();
        for (int i = 0; i < 3; i++) {
            System.out.println("请你输入0，1，2：");
            userNum = getUserNum.nextInt();
            tomChat.CompereTom(userNum);
        }
        System.out.println("你赢的次数为：" + tomChat.Vcount + "你输的次数为：" + tomChat.Dcount);
    }

}

class TomChat {
    int randomInt;
    int Vcount = 0;
    int Dcount = 0;

    //随机生成0，1，2
    public int RandomInt() {
        Random random = new Random();
        randomInt = random.nextInt(2);
        return randomInt;
    }

    //输赢判断计数
    public int CompereTom(int userNum) {
        int computerNum = RandomInt();
        if (userNum >= 0 && userNum < 3) {
            if (userNum == computerNum) {
                System.out.println("和局");
            } else if (computerNum == 0 && userNum == 2) {
                System.out.println("恭喜你赢得一次");
                Vcount++;
            } else if (computerNum == 0 && userNum == 1) {
                System.out.println("很遗憾你输了");
                Dcount++;
            } else if (computerNum == 1 && userNum == 0) {
                System.out.println("恭喜你赢得一次");
                Vcount++;
            } else if (computerNum == 1 && userNum == 2) {
                System.out.println("很遗憾你输了");
                Dcount++;
            } else if (computerNum == 2 && userNum == 1) {
                System.out.println("恭喜你赢得一次");
                Vcount++;
            } else if (computerNum == 2 && userNum == 0) {
                System.out.println("很遗憾你输了");
                Dcount++;
            }
        } else {
            System.out.println("你输入错误啦");
        }
        return 0;
    }
}
