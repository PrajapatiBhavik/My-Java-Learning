package com.springframework.lifecycle;

import org.example.App;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SFLifeCycle
{
    public static void main(String[] args)
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleconfig.xml");
        Pepsi pepsi = (Pepsi) context.getBean("pepsi");
        context.registerShutdownHook();
        System.out.println(pepsi.toString());


        Apple apple = (Apple)context.getBean("apple");
        System.out.println(apple.toString());

        Wafers wafers = (Wafers) context.getBean("wafers");
        System.out.println(wafers.toString());

    }
}
