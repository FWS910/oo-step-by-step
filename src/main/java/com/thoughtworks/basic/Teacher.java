package com.thoughtworks.basic;

public class Teacher extends Person {
    private String job;
    private String new_message;

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

    public String Message(){
        return "My name is Tom. I am 21 years old. I am a student of Class 2 now.";
    }

}
