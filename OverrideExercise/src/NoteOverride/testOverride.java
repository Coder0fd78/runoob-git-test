package NoteOverride;

import CourseTestOverride.Person;
import CourseTestOverride.Student;

public class testOverride {
    public static void main(String[] args) {
        //课堂笔记
//        Dog dog = new Dog();
//        dog.cry();
        //名称        发生范围        方法名         形参列表        返回类型            修饰符
        //重载：       本类；         必须一样        类型个数顺序至   无需求               无需求
        //                                        少有一个不同
        //重写：       父子类；        必须一样        相同          返回类型和父类一致，      子类方法不能缩
        //                                                                              小父类的访问范围
        //                                                        或是它的子类
        //================================课堂练习=====================================
        Person person = new Person("罗永浩", 38);
        Student student = new Student("小白", 15, 23, 563.5);
        person.say();
        student.say();
    }
}
