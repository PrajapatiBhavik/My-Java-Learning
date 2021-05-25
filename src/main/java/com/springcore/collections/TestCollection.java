package com.springcore.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("collectionconfig.xml");
        Person p1 = (Person) context.getBean("CollectionFramework");
        System.out.println("This Is String : "+ p1.getfName());
        System.out.println("This Is List : " + p1.getnLaptops());
        System.out.println("This Is Map : " + p1.getNickName());
        System.out.println("This Is Set : " + p1.getnAddress());
        System.out.println("This Is Property : " + p1.getGamePerson());
    }
}
