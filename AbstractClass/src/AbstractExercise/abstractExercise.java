package AbstractExercise;

public class abstractExercise {
    public static void main(String[] args) {
        Manager manager = new Manager("李二", 05, 8000, 150000);
        CommonEmployee commonEmployee = new CommonEmployee("王三", 06, 12000);
        manager.work();
        commonEmployee.work();
    }
}
