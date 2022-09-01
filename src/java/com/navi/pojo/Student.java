package com.navi.pojo;

public class Student {
    String fname;
    String name;

    public Student(String fname, String name) {
        this.fname = fname;
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
