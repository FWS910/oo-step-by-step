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

    public void updateName(String newName){
        super.setName(newName);
    }

    public void updateClass(Class newClassNumber){
        setclassNumber(newClassNumber);
    }

    public void Message(){
        System.out.println("My name is Tom. I am 21 years old. I am a student of Class 2 now.");
    }

    public void notifyWhenUpdateName(String oldName, String newName){
        if (!oldName.equals(newName)){
            updateName(newName);
            List<Student> students = classNumber.getStudent();
            Teacher teacher = classNumber.getTeacher();
            teacher.Message();
            for (int i=0;i<students.size();i++){
                students.get(i).Message();
            }
        }
    }

    public void notifyWhenUpdateClass(Class oldClass, Class newClass){
        if (oldClass.getClassNumber() != newClass.getClassNumber()){
            updateClass(newClass);
            List<Student> oldClassStudents = oldClass.getStudent();
            List<Student> newClassStudents = newClass.getStudent();
            Teacher oldClassTeacher = oldClass.getTeacher();
            Teacher newClassTeacher = newClass.getTeacher();
            oldClassTeacher.Message();
            newClassTeacher.Message();
            for (int i=0;i<oldClassStudents.size();i++){
                oldClassStudents.get(i).Message();
            }
            for (int j=0;j<newClassStudents.size();j++){
                newClassStudents.get(j).Message();
            }
        }
    }
}
