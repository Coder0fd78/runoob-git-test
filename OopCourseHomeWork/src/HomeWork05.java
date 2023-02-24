public class HomeWork05 {
    public static void main(String[] args) {
    //普工工人
        worker worker = new worker("王二", 80);
        worker.printSal();
        //农民
        Peasant peasant = new Peasant("冯大", 70);
        peasant.printSal();
        //教师
        Teacher teacher = new Teacher("谢三", 120, 40);
        teacher.printSal();
        //科学家
        Scientist scientist = new Scientist("张三", 300, 100000);
        scientist.printSal();
        //服务生
        Waiter waiter = new Waiter("刘四", 90);
        waiter.printSal();


    }
}
//父类
class Employee{
    //属性
    private String name;
    private double salary;
    //构造器
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void printSal(){
        System.out.println(getName()+"的工资是："+getSalary()*280);
    }

}
//工人    Worker      基本工资
class worker extends Employee{
    public worker(String name, double salary) {
        super(name, salary);
    }

    public void printSal(){
        System.out.println("普通工人\t"+getName()+"\t的工资是："+getSalary()*280);
    }
}
//农民    Peasant     基本工资
class Peasant extends Employee{
    public Peasant(String name, double salary) {
        super(name, salary);
    }
    public void printSal(){
        System.out.println("农民\t"+getName()+"\t的工资是："+getSalary()*280);
    }
}
//教师    Teacher     课酬
class Teacher extends Employee{
    private double courseSalary;

    public Teacher(String name, double salary, double courseSalary) {
        super(name, salary);
        this.courseSalary = courseSalary;
    }
    public void printSal(){
        System.out.println("教师\t"+getName()+"\t的工资是："+(getSalary()+courseSalary)*280);
    }
}
//科学家   Scientist   年终奖
class Scientist extends Employee{
   private double YearBonus;

    public Scientist(String name, double salary, double yearBonus) {
        super(name, salary);
        YearBonus = yearBonus;
    }
    public void printSal(){
        System.out.println("科学家\t"+getName()+"\t的工资是："+((getSalary()*280)+YearBonus));
    }
}
//服务生   Waiter      基本工资
class Waiter extends Employee{
    public Waiter(String name, double salary) {
        super(name, salary);
    }
    public void printSal(){
        System.out.println("服务生\t"+getName()+"\t的工资是："+(getSalary())*280);
    }
}