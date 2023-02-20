package CourseTestOverride;

public class Student extends Person{
    private int id;
    private double score;
    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public void say(){
        System.out.println("我的名字是"+getName()+"我的年龄是"+getAge()+"我的Id是"+getId()+"我的分数是"+getScore());
    }
}
