package HomeWork13;

public class Teacher extends Person{
    private  int Seniority;

    public Teacher(String name, int age, char sex, int seniority) {
        super(name, age, sex);
        Seniority = seniority;
    }

    public int getSeniority() {
        return Seniority;
    }

    public void setSeniority(int seniority) {
        Seniority = seniority;
    }
    public void Teach(){
        System.out.println("我承诺，我会认真教学");
    }

    @Override
    public void Play() {
        System.out.println(getName()+"爱玩象棋");
    }
    public void say(){
        System.out.println("老师信息：");
        System.out.println("姓名："+getName());
        System.out.println("年龄："+getAge());
        System.out.println("性别："+getSex());
        System.out.println("工龄："+getSeniority());
       Teach();
        Play();
    }

}
