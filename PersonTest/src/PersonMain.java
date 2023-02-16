public class PersonMain {
    public static void main(String[] args) {
        Person person1=new Person("小白",5);
        Person person2=new Person("Smith",25);
        System.out.println(person1.compereTo(person2));
    }
}
