package HomeWork01;

public class HomeWork01 {
    //定义一个Person类{name . age. job}初始化Person对象数据，有三个person对象，并按照AGE排序从大到小
    public static void main(String[] args) {
        //new 数组
        Person[] persons = new Person[3];
        persons[0] = new Person("jack", 18, "java工程师");
        persons[1] = new Person("deveai", 26, "java架构师");
        persons[2] = new Person("smith", 24, "PHP工程师");
        //打印排序前的数组
        System.out.println("======排序前=======");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
        //冒泡排序
        Person temp = null;
       // 按年龄
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
//        //按名字长度
//                for (int i = 0; i < persons.length - 1; i++) {
//            for (int j = 0; j < persons.length - 1 - i; j++) {
//                if (persons[j].getName().length() < persons[j + 1].getName().length()) {
//                    temp = persons[j];
//                    persons[j] = persons[j + 1];
//                    persons[j + 1] = temp;
//                }
//            }
//        }
        //打印排序后的数组
        System.out.println("======排序后=======");
        for (int j = 0; j < persons.length; j++) {
            System.out.println(persons[j]);
        }

    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
