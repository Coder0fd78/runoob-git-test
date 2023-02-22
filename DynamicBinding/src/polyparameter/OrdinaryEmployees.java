package polyparameter;

public class OrdinaryEmployees extends Employee{
    public OrdinaryEmployees(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
    public void work(){
        System.out.println("我是普通员工，我打螺丝");
    }
}
