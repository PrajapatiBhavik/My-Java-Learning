package com.springframework.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorDi
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("constructordiconfig.xml");
        Student student = (Student) context.getBean("Student");
        System.out.println(student.toString());

        Addition addition = (Addition) context.getBean("addition");
        addition.doSum();
    }
}
