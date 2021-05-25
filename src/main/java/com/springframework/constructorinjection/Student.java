package com.springframework.constructorinjection;

public class Student
{
    private String studentName;
    private String studentAddress;
    private String studentGender;
    private String studentAge;
    private Course courseName;

    public Student() {
        super();
    }

    public Student(String studentName, String studentAddress, String studentGender, String studentAge, Course courseName) {
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentGender = studentGender;
        this.studentAge = studentAge;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentGender='" + studentGender + '\'' +
                ", studentAge='" + studentAge + '\'' +
                ", courseName=" + courseName +
                '}';
    }
}
