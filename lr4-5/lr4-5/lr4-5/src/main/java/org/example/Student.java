package org.example;

public class Student {
    private String name;
    private double grade;
    private String group;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student (String name, double grade, String group){
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public String toString(){
        return "Имя: " + name + "\nБалл: " + grade + "\nГруппа: " + group;
    }
}