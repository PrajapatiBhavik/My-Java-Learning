package com.springframework.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereoAnnotation
{
    public static void main(String[] args)
    {
        ApplicationContext context =  new ClassPathXmlApplicationContext("stereotypeannotationconfig.xml");
        Tiger tiger = context.getBean("tiger",Tiger.class);
        System.out.println(tiger.toString());


        //Create Another Object of class Tiger

        Tiger master = context.getBean("tiger", Tiger.class);

        Courses courses = context.getBean("courses",Courses.class);
        System.out.println(courses.toString());
        System.out.println(courses.getCourses().getClass().getName());

        System.out.println(tiger.hashCode());
        System.out.println(master.hashCode());
        System.out.println(courses.hashCode());

    }
}
