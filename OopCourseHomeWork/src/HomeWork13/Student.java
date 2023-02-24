package HomeWork13;

public class Student extends Person{
    private  int id;

    public Student(String name, int age, char sex, int id) {
        super(name, age, sex);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void study (){
        System.out.println("我承诺，我会认真学习");
    }

    @Override
    public void Play() {
        System.out.println(getName()+"爱玩足球");;
    }
    public void say(){
        System.out.println("学生信息：");
        System.out.println("姓名："+getName());
        System.out.println("年龄："+getAge());
        System.out.println("性别："+getSex());
        System.out.println("学号："+getId());
        study();
       Play();
    }
}
