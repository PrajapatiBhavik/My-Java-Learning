package com.springframework.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Apple implements InitializingBean, DisposableBean
{
    private String appleColor;
    private int applePrice;
    private String appleSize;


    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public int getApplePrice() {
        return applePrice;
    }

    public void setApplePrice(int applePrice) {
        this.applePrice = applePrice;
    }

    public String getAppleSize() {
        return appleSize;
    }

    public void setAppleSize(String appleSize) {
        this.appleSize = appleSize;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "appleColor='" + appleColor + '\'' +
                ", applePrice=" + applePrice +
                ", appleSize='" + appleSize + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init() Method Called :- using interface");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy() Method Called :- using interface");
    }
}
