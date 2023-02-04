import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistAndLoginService {
    //         a.数据存在哪儿 (一般存放在数据库里去，这里直接简化一下 放在一个List里面)
    private List<AccountAndPassWord> list;

    public RegistAndLoginService() {
        list = new ArrayList<>();
    }

    public static void main(String[] args) {
        RegistAndLoginService registAndLoginService = new RegistAndLoginService();
        registAndLoginService.run();
    }

    /*
     * run方法串联起两个功能*/
    public final void run() {
        while (true) {
            System.out.println("注册or登录");
            Scanner sc = new Scanner(System.in);
            String command = sc.nextLine();
            if ("注册".equals(command)) {
                regist();
            }
            if ("登录".equals(command)) {
                login();
            } else {
                System.out.println("非法输入");
            }
        }
    }

    /*
     * 登录功能*/
    public void login() {
        //1.获取 数据
        Scanner sc = new Scanner(System.in);
        System.out.println("账号：");
        String account = sc.nextLine();
        System.out.println("密码：");
        String password = sc.nextLine();
        //2.校验 数据
        AccountAndPassWord inputaccountAndPassWord = new AccountAndPassWord(account, password);
        int index = list.indexOf(inputaccountAndPassWord);
        if (index == -1) {
            System.out.println("账号不存在喔，请重新输入");
        } else {
            AccountAndPassWord accountAndPassWord = list.get(index);
            if (!accountAndPassWord.getPassword().equals(inputaccountAndPassWord.getPassword())) {
                System.out.println("密码错误喔，请重新输入");
            } else {
                System.out.println("登录成功");
            }
        }
        //3.返回 注册结果
    }

    /*
     * 注册功能*/
    public void regist() {
//        实现注册功能
//         1.获取 数据
//           a.怎么获取数据呢？ 监听键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("账号：");
        String account = sc.nextLine();
        System.out.println("密码：");
        String password = sc.nextLine();
//         2.存储 数据
//          a.数据存在哪儿 (一般存放在数据库里去，这里直接简化一下 放在一个List里面)
        AccountAndPassWord inputAccountAndPassWord = new AccountAndPassWord(account, password);
//            b.判断账号是否存在
        //判断字符串相等就得Equals方法
        if (list.contains(inputAccountAndPassWord)) {
            System.out.println("您的账户已经存在了喔！");
        } else {
            list.add(inputAccountAndPassWord);
            //        * 3.返回 注册结果
            System.out.println("已经注册成功呢呀！");
        }

    }
}
