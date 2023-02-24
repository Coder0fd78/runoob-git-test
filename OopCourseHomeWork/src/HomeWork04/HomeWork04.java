package HomeWork04;

public class HomeWork04 {
    public static void main(String[] args) {
        worker worker = new worker("罗永", 300, 31);
        manger manger = new manger("贾生", 350, 31);
        worker.Income(worker);
        manger.Income(manger);
    }
}

class Employee{
    //员工属性{名字，单日工资，工作天数}
    private String name;
    private double salary;
    private int day;

    //构造器
    public Employee(String name, double salary, int day) {
        this.name = name;
        this.salary = salary;
        this.day = day;
    }


    //GetterAndSetter
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

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    //打印 工资 方法
    public void Income(Employee employee){
        System.out.println("员工"+getName()+"的工资是："+salary*day);
    }
}

    //普通员工
class worker extends Employee{
    public worker(String name, double salary, int day) {
        super(name, salary, day);
    }
    public void Income(Employee employee){
        System.out.println("普通员工"+getName()+"的工资是："+(employee.getSalary()*getDay()*1.0));
    }
}
    //经理
class manger extends Employee{
    public manger(String name, double salary, int day) {
        super(name, salary, day);
    }
    public void Income(Employee employee){
        System.out.println("部门经理"+getName()+"的工资是："+(employee.getSalary()*getDay()*1.2+1000));
    }
}