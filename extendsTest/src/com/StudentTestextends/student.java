package com.StudentTestextends;

public class student {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo(){
        System.out.println("学生名字："+name+"学生年龄："+age+"学生分数："+score);
    }
}
