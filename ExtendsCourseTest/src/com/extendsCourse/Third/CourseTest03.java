package com.extendsCourse.Third;

public class CourseTest03 {
    public static void main(String[] args) {
        PC pc = new PC("IntelCore_i5","金力士16G","七彩虹500G-SSD","戴尔");
        pc.showPC();
        NotePad notePad = new NotePad("麒麟H5", "华为8G", "华为256G", "银白色");
        notePad.showNotePad();

    }
}

class Computer {
    private String CPU;
    private String Memory;
    private String HardDisk;

    public Computer(String CPU, String memory, String hardDisk) {
        this.CPU = CPU;
        Memory = memory;
        HardDisk = hardDisk;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMemory() {
        return Memory;
    }

    public void setMemory(String memory) {
        Memory = memory;
    }

    public String getHardDisk() {
        return HardDisk;
    }

    public void setHardDisk(String hardDisk) {
        HardDisk = hardDisk;
    }

    public String getDetail() {
        return "CPU：" + CPU + "内存：" + Memory + "硬盘: " + HardDisk;
    }
}

class PC extends Computer {
    private String Brand;

    //这里IDEA直接根据继承的规则直接生成
    //这里也体现：继承设计的基本思想：父类的构造器完成父类的属性生成
    //子类的构造器完成子类的属性生成
    public PC(String CPU, String memory, String hardDisk, String brand) {
        super(CPU, memory, hardDisk);//父类的构造器完成父类的属性生成
        Brand = brand;//子类的构造器完成子类的属性生成
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void showPC() {
        System.out.println(getDetail() + "品牌 ：" + Brand);
    }
}

class NotePad extends Computer {
    private String color;

    public NotePad(String CPU, String memory, String hardDisk, String color) {
        super(CPU, memory, hardDisk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showNotePad() {
        System.out.println(getDetail() + "颜色： " + color);
    }
}
