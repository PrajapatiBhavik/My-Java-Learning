package com.springframework.avoidXml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAvoidXmlUsingAnnotation
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Student.class);
        Student student = context.getBean("student",Student.class);
        System.out.println(student.toString());
        student.showMessage();
    }
}
