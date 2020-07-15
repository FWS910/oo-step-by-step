package com.thoughtworks.basic;

import java.util.List;

public class Student extends Person{
    private Class classNumber;

    public Student() {
    }

    public Class getClassNumber() {
        return classNumber;
    }

    public void setclassNumber(Class classNumber) {
        this.classNumber = classNumber;
    }

    public Student(String name, String age, Class classNumber) {
        super(name, age);
        this.classNumber = classNumber;
    }

    public String introduce(){
        return "My name is Tom. I am 21 years old. I am a Student of Class 2.";
    }
    

}
