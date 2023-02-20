package NoteOverride;

public class Dog extends Animal{
    //因为Dog是Animal的子类，Dog的cry方法和Animal的定义形式一样（名字，返回类型，参数），这时我们就说Dog的cry重写了Animal的cry方法
    public void cry(){
        //1.子类的方法的参数，方法名称，要和父类的方法的参数，方法名称完全一样

        System.out.println("小狗叫唤....");
    }
    public String jump(){
        //2子类的返回类型和方法的返回类型一样，或者返回类型的子类比如：String 就是Object的子类
        return " String jump...";
    }
    //子方法不能缩小父类方法的访问权限:public 的访问权限就比默认大 具体顺序：public->默认->protected->private
    public void sayOK(){
        System.out.println("DogSayOk...");
    }
//    protected void sayOK(){
//        这样就会报错
//    }
}
