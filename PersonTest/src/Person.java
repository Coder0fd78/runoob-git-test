public class Person {
    //定义属性
    String name;
    int age;
    //构造器
    public  Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    //方法compereTo
    public boolean compereTo(Person person){
        return this.name.equals(person)&&this.age== person.age;
    }
}
