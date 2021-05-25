package com.springframework.expressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestExpressionLanguage
{
    public static void main(String[] args)
    {
        ApplicationContext context =  new ClassPathXmlApplicationContext("ExpressionLanguageconfig.xml");
        Demo language = context.getBean("demo", Demo.class);
        System.out.println(language.toString());


        //Another way to solve the expression using SpelExpressionParser Class
        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("20 + 40");
        System.out.println(expression.getValue());
    }
}
