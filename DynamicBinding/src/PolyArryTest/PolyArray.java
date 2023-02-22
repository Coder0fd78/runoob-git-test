package PolyArryTest;

public class PolyArray {
    public static void main(String[] args) {
        Person people[]=new Person[5];
        people[0]=new Person("jack",18);
        people[1]=new Student("smith",9,80.6);
        people[2]=new Student("devi",10,95.3);
        people[3]=new Teacher("scott",25,3500);
        people[4]=new Teacher("Lie",28,4500);
        for (int i = 0; i < people.length; i++) {
            //people[i]他的编译类型是Person 运行类型是根据实际情况
            System.out.println(people[i].say()); //动态绑定的
            if(people[i] instanceof Student){
                System.out.println(((Student)people[1]).study());
            }else if (people[i] instanceof Teacher){
                System.out.println(((Teacher)people[i]).teach());
            }else if(!(people[i] instanceof Student)&&!(people[i] instanceof Teacher)){
                System.out.println(people[i].run());
            }
        }
      //如何掉用子类特有的方法



    }
}
