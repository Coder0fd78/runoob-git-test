package TemplateDesign;

public abstract class Template {
    public abstract void job();
    public void caleTime(){
        long star=System.currentTimeMillis();
        job();
        long end=System.currentTimeMillis();
        System.out.println("耗时："+(end-star));
    }
}
