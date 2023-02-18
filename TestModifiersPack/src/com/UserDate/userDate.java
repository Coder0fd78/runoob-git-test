package com.UserDate;

public class userDate {
    private String name;
    private int age;
    private double salary;
    private char sex;

    public userDate() {
    }

    public userDate(String name, int age, double salary, char sex) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//        this.sex = sex;
        //如果直接使用构造器就没办法使用自己的约束了所以我们可以将seter写到构造器了
        setName(name);//=>this.setName(name)
        setSex(sex);
        setSalary(salary);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=2&&name.length()<=6){
        this.name = name;}else{
            System.out.println("你输入的名字格式不对喔");
            this.name="无名";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>1&&age<120){
        this.age = age;}else{
            System.out.println("你设置的年龄不对喔");
        this.age=18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if(sex=='男'||sex=='女'){
        this.sex = sex;}else{
            System.out.println("你输入的性别有误将默认为男");
        this.sex='男';
        }
    }
    public String show(){
        return "名字："+this.name+"性别："+this.sex+"年龄："+this.age+"薪水："+this.salary;
    }
}
