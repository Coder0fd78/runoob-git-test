package HomeWork07;

/**
 * @version 1.0
 * @autor LuoJunwei
 */
public class Car {
    private double temperature;
    public Car(double temperature) {
        this.temperature = temperature;
    }
    class Air{
        public void flow(){
            if(Car.this.temperature>40){
                System.out.println("制冷中...");
            }else if(Car.this.temperature<0){
                System.out.println("暖气开了...");
            }else if(Car.this.temperature<=40&&Car.this.temperature>=0){
                System.out.println("关机...");
            }
        }
    }
}
