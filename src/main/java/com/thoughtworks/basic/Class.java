package com.thoughtworks.basic;

import java.util.List;

public class Class {
    private List<Student> student;
    private Teacher teacher;
    private Integer classNumber;

    public Class(List<Student> student, Teacher teacher, Integer classNumber) {
        this.student = student;
        this.teacher = teacher;
        this.classNumber = classNumber;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Integer getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
