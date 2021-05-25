package com.springframework.constructorinjection;

public class Course
{
    private String cName;

    public Course()
    {
        super();
    }

    public Course(String cName) {
        this.cName = cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcName() {
        return cName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cName='" + cName + '\'' +
                '}';
    }
}
