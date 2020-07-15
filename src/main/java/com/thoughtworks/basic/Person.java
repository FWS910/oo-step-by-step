package com.thoughtworks.basic;

public class Person {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String introduce(){
        return "My name is Tom. I am 21 years old.";
    }
}
