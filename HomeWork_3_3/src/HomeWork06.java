/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class HomeWork06 {
    public static void main(String[] args) {
        Person person = new Person("唐僧", new Boat());
        person.common(person);
        person.passRiver(person);
        person.huoyanshan(person);
    }
}

interface Vehicles {
    public void work();
}

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("一般情况骑马...");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("过河的时候坐船");
    }
}
class Plan implements Vehicles{
    @Override
    public void work() {
        System.out.println("过火焰山开飞机...");
    }
}

class Tools {
     public  void getHorse() {
        Horse horse = new Horse();
        horse.work();
    }

    public  void getBoat() {
        Boat boat = new Boat();
        boat.work();
    }
    public void getPlan(){
         new Plan().work();
    }
}

class Person {
    private String name;
    private Vehicles Vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.Vehicles = vehicles;
    }

    public void common(Person person) {
        new Tools().getHorse();
    }

    public void passRiver(Person person) {
        new Tools().getBoat();

    }
    public void huoyanshan(Person person){
        new Tools().getPlan();
    }
}