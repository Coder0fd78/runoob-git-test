package InterFacesVsExtends;

public class Monkey {
    private String name;
    private int age;
    private String  color;

    public Monkey(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void clime(){
        System.out.println(getName()+"通过继承会爬山");
    }
}
