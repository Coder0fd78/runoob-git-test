package TemplateDesign;

public class AA extends Template{
    private int sum;
    @Override
    public void job() {
        for (int i = 0; i < 5000000; i++) {
             sum+=i;
        }
    }



}
