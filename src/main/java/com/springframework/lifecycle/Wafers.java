package com.springframework.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Wafers
{
    private String waferFlavor;
    private int waferPrice;

    public Wafers()
    {
        super();
    }

    public String getWaferFlavor() {
        return waferFlavor;
    }

    public void setWaferFlavor(String waferFlavor) {
        this.waferFlavor = waferFlavor;
    }

    public int getWaferPrice() {
        return waferPrice;
    }

    public void setWaferPrice(int waferPrice) {
        this.waferPrice = waferPrice;
    }

    @PostConstruct
    public void init()
    {
        System.out.println("init() Method Called :- Using Annotations");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("destroy() Method Called :- Using Annotations");
    }

    @Override
    public String toString() {
        return "Wafers{" +
                "waferFlavor='" + waferFlavor + '\'' +
                ", waferPrice=" + waferPrice +
                '}';
    }
}
