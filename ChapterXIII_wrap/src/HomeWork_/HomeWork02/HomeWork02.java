package HomeWork_.HomeWork02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class HomeWork02 {
    public static void main(String[] args) {
        coiledEnroll();

    }
    public static void coiledEnroll(){
        boolean loop=true;
        while(loop){
            Enroll();
            System.out.println("请输入是否继续注册新用户：");
            Scanner sd = new Scanner(System.in);
            char lp=sd.next().charAt(0);
            if(lp=='y'||lp=='n'){
                if(lp=='y'){
                    loop=true;
                }if(lp=='n'){
                    System.out.println("结束...");
                    System.exit(0);
                }
            }else{
                System.out.println("输入非法请重新输入");
                coiledEnroll();
            }
        }
    }
    public static void Enroll(){

        try {
            Scanner getUser = new Scanner(System.in);
            System.out.println("=======注册=========");
            System.out.println("请输入您的用户名：");
            String usName = getUser.next();
            System.out.println("请输入您的密码：");
            String psWord = getUser.next();
            System.out.println("请输入您的邮箱：");
            String eMail = getUser.next();
            //校验
            //接收返回的数组
            user [] users={Registered(usName, psWord, eMail)};
            System.out.println(Arrays.toString(users));
        } catch (Exception e) {
            exit();
        }

    }
        public static void exit(){
            System.out.println("请输入是否重新创建y/n");
            Scanner getIndex = new Scanner(System.in);
            char loop=getIndex.next().charAt(0);
            if(loop=='y'||loop=='n'){
                if(loop=='y'){
                    Enroll();
                }if(loop=='n'){
                    System.exit(0);
                }
            }else{
                System.out.println("输入非法请重新输入");
                exit();
            }
        }
    public static user Registered(String username, String password, String email) {
        //判断用户名是否合法
        if (username.length() < 2 || username.length() > 4) {
            System.out.println("用户名长度应该为2-4位");
            throw new RuntimeException();
        }
        //判断密码是否合法
        //1.将字符串转换为字符数组
        if (password.length() == 6) {
            char[] i = password.toCharArray();
            //遍历查看是否输入合法
            for (int j = 0; j < 6; j++) {
                boolean t = Character.isDigit(i[j]);
                if (t = false) {
                    throw new RuntimeException();
                }
            }
        } else {
            System.out.println("密码长度应该为6位");
            throw new RuntimeException();
        }
        //检测邮箱是否合法
        int n1 = email.indexOf('@');
        int n2 = email.indexOf('.');
        if (n1 == -1 || n2 == -1) {
            System.out.println("输入的邮箱应该包含@和.");
            throw new RuntimeException();
        }
        if (n1 != -1 && n2 != -1) {
            if (n1 > n2) {
                System.out.println("输入的邮箱不合法");
                throw new RuntimeException();
            }
        }
        System.out.println("恭喜你通过校验，完成注册");
        user user1 = new user(username, password, email);
        return user1;
    }
}

class user {
    private String userName;
    private String passWord;
    private String Email;

    public user(String userName, String passWord, String email) {
        this.userName = userName;
        this.passWord = passWord;
        Email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "user{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}