package com.springframwork.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWiring
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiringconfig.xml");

        Person person = context.getBean("person",Person.class);
        System.out.println(person.toString());

    }
}
