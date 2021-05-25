package com.springframwork.referencetypeDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReferenceDi
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("referenceconfig.xml");
        Animal animal = (Animal) context.getBean("Animal");

        System.out.println("Animal Name Is : " + animal.getAnimalName());
        System.out.println("Bird Name Is : " + animal.getBirdName().getBirdName());
    }
}
