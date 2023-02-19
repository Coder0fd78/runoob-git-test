package com.StudentTestextends;

public class ExtendsMain {
    public static void main(String[] args) {
        puipu puipu = new puipu();
        graduat graduat = new graduat();
        puipu.name="银角大王";
        puipu.age=10;
        puipu.setScore(50);
        graduat.name="金角大王";
        graduat.age=21;
        graduat.setScore(80);
        puipu.testing();
        puipu.showInfo();
        graduat.testing();
        graduat.showInfo();
    }
}
