package equalsCourse01;

public class equalsTest {
    public static void main(String[] args) {
        person person = new person("jack", 18, '男');
        person person1 = new person("jack", 18, '男');
        System.out.println(person.equals(person1));

    }
}

class person {
    private String name;
    private int age;
    private char gender;

    public person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    //重写equals方法
    public boolean equals(Object anObject) {
        //如果比较的对象是同一个对象，则直接返回ture
        if (this == anObject) {
            return true;
        }
        //类型判断
        if (anObject instanceof person) {
            //如果同类就开始比较各个属性
            if (((person) anObject).name.equals(this.name) && ((person) anObject).age == this.age && ((person) anObject).gender == this.gender) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
