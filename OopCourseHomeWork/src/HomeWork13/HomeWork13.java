package HomeWork13;

public class HomeWork13 {
    public static void main(String[] args) {
        Person[] persons=new Person[4];
        persons[0]=new Teacher("王德",59,'男',35);
        persons[1]=new Teacher("谢重华",49,'男',26);
        persons[2]=new Student("谢莲",16,'女',2021027);
        persons[3]=new Student("罗通",18,'男',2021067);
        HomeWork13 homeWork13 = new HomeWork13();
        homeWork13.Sort(persons);
        System.out.println("------------------------");
        persons[0].say();
        System.out.println("------------------------");
        persons[2].say();

        System.out.println("------------------------");
        ((Teacher) persons[0]).Teach();
        ((Student)persons[2]).study();



    }
    //排序
    public Person[] Sort(Person[] p){

        System.out.println("=========排序前=====");
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
        Person temp=null;
        for (int i = 0; i < p.length-1; i++) {
            for (int j = 0; j < p.length-i-1; j++) {
                if(p[j].getAge()<p[j+1].getAge()){
                    temp=p[j+1];
                    p[j+1]=p[j];
                    p[j]=temp;
                }
            }
        }
        System.out.println("======排序后=====");
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
        return p;
    }

}
