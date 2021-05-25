package com.springframework.expressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo
{
    @Value("#{ 100 + 200 }")
    private int num1;

    @Value("#{ 15 + 15 }")
    private int num2;

    @Value("#{ T(java.lang.Math).sqrt(25) }") //Static Method Called
    private int root;

    @Value("#{ T(java.lang.Math).E }")
    private double getStaticVariable;

    public Demo() {
        super();
    }

    public Demo(int num1, int num2, int root, double getStaticVariable) {
        this.num1 = num1;
        this.num2 = num2;
        this.root = root;
        this.getStaticVariable = getStaticVariable;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getRoot() {
        return root;
    }

    public void setRoot(int root) {
        this.root = root;
    }

    public double getGetStaticVariable() {
        return getStaticVariable;
    }

    public void setGetStaticVariable(double getStaticVariable) {
        this.getStaticVariable = getStaticVariable;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", root=" + root +
                ", getStaticVariable=" + getStaticVariable +
                '}';
    }
}
