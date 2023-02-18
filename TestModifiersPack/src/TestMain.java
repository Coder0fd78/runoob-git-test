import com.UserDate.userDate;

public class TestMain {
    public static void main(String[] args) {
        userDate userDate = new userDate();
        userDate.setName("李二");
        userDate.setAge(21);
        userDate.setSalary(3000.0);
        userDate.setSex('男');
        System.out.println(   userDate.show());
        com.UserDate.userDate userDate1 = new userDate("smith", 25, 5000.0, '男');
        System.out.println("======smith的信息=======");
        System.out.println(userDate1.show());

    }
}
