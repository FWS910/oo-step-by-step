package com.thoughtworks.basic;

public class Teacher extends Person {
    private String job;

    public Teacher(String name, String age, String job) {
        super(name, age);
        this.job = job;
    }


    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String introduce(){
        return "My name is Matt. I am 30 years old. I am a Teacher.";
    }


}
