package polyparameter;

public class manger extends Employee{
    private double bonus;

    public manger(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+bonus;
    }
    public void manageMethod(){
        System.out.println("我是经理，我管理普通员工");
    }
}
