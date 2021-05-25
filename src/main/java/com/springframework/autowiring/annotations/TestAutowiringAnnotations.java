package com.springframework.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiringAnnotations
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiringannotationsconfig.xml");
        Bhavikk bhavikk = context.getBean("bhavikk", Bhavikk.class);
        System.out.println(bhavikk.toString());
    }
}
