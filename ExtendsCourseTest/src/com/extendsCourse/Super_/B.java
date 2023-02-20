package com.extendsCourse.Super_;

public class B extends A{
    public void test(){
        //super的访问不限于直接父类，如果爷爷类和本类有同名成员，也可以使用super去访问爷爷类的成员
        //如果多个基类中都有同名的成员，使用super访问遵循就近原则
        //当然也需要遵守访问权限规则
        System.out.println("super.n1="+super.n1);
    }
    int n1=800;
    //访问父类的属性，但不能访问父类的private属性
    public void hi(){
        System.out.println(super.n1+" "+super.n2+" "+super.n3+" "/*super.n4*/);//n4是私有属性所以不能访问
    }
    public void cal(){
        System.out.println("这是B类的CAL方法");
    }
    public void sum(){
        System.out.println("这是B类的SUM方法");
        //希望调用父类的Cal方法
        //这是，因为子类B没有cal方法，所以我们有三种方法可以调用
        //1.
        cal();//找cal方法时，先找本来，如果有，则调用，如果没有，则找父类的，如果有并且可以调用，则调用，如果没有就找父类的父类。
        //提示：如果在查找方法的过程中，找到了，但不能访问，则报错。如果没有找到，则提示该方法不存在。
        //2.
        super.cal();//找cal方法的顺序是直接去父类查找，其他规则和上面一样
        //3.
        this.cal();//等价与 cal()
        /*属性和方法的访问规则是一样的====*/
        System.out.println(n1);
        System.out.println(this.n1);
        System.out.println(super.n1);

    }
    public void ok(){
        super.test100();
        super.test200();
        super.test300();
       // super.test400();//test400是私有方法不能访问
    }
    //访问父类的构造器：super(参数列表)；只能放在构造器的第一句，只能出现一句
    public B(){
        //super();
        //super("name");
        //super("name",18);
    }
}
