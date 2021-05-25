package com.springframework.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestStandAloneCollections
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalonecollectionsconfig.xml");
        Person person = context.getBean("person",Person.class);
        System.out.println(person.getFriends().getClass().getName());
        System.out.println(person.getNickName().getClass().getName());
        System.out.println(person.getSkills().getClass().getName());
        System.out.println(person.toString());

    }
}
