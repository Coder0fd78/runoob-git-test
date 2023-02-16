public class This_HashCode {
    static class Dog{
        public String name;
        public int age;
        public Dog(String name,int age){
            this.name=name;
            this.age=age;
        }
        public void info(){
            System.out.println(this.age+"\t"+this.name+"\t"+"当前对象的HashCode："+this.hashCode());
        }
    }

    public static  void main(String[] args) {
        Dog dog=new Dog("小艾",3);
        System.out.println("dog的HashCode："+dog.hashCode());
        dog.info();
        Dog dog1=new Dog("小白",5);
        System.out.println("dog1的HashCode："+dog1.hashCode());
        dog1.info();
    }
}
