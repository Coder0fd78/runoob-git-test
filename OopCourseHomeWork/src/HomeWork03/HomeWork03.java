package HomeWork03;

public class HomeWork03 {
    public static void main(String[] args) {
        professor professor = new professor("贾宝玉", 26, "高级", 8000);
        professor.introduce(professor);
    }
}
class  Teacher{
    private String name ;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }
    public void introduce(Teacher t){
        System.out.println(t.toString());
    }
}
class professor extends Teacher{
    public professor(String name, int age, String post, double salary) {
        super(name, age, post, salary*1.3);
    }
    public void introduce(Teacher t){
        System.out.println("这是教授");
        System.out.println(t.toString());
    }
}
class associateProfessor extends Teacher{
    public associateProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary*1.2);
    }
    public void introduce(Teacher t){
        System.out.println("这是副教授");
        System.out.println(t.toString());
    }
}

class lecturer extends Teacher{
    public lecturer(String name, int age, String post, double salary) {
        super(name, age, post, salary*1.1);
    }
    public void introduce(Teacher t){
        System.out.println("这是讲师");
        System.out.println(t.toString());
    }
}