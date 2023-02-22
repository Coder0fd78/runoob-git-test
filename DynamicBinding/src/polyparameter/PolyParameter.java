package polyparameter;

public class PolyParameter {
    public static void main(String[] args) {

        Employee e1=new OrdinaryEmployees("smith",2000);
        Employee e2=new manger("etr",3500,1500);

       PolyParameter polyParameter=new PolyParameter();
        System.out.println("我的工资是："+polyParameter.showEmpAnnal(e2));
        polyParameter.testWork(e2);
    }
    public double showEmpAnnal(Employee e){
        return e.getAnnual();
    }
    public void testWork(Employee e){
        if(e instanceof OrdinaryEmployees){
            System.out.println("我是"+e.getName());
            ((OrdinaryEmployees) e).work();
        }if(e instanceof manger){
            System.out.println("我是"+e.getName());
            ((manger) e).manageMethod();
        }
    }
}
