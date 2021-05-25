package com.springframework.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bhavikk
{
    @Autowired   // :- for Fields
    @Qualifier("jaydeep1")
    private Jaydeep jaydeep;


    //@Autowired   // :- for Constructors
    public Bhavikk(Jaydeep jaydeep) {
        this.jaydeep = jaydeep;
        System.out.println("using Constructor");
    }

    public Bhavikk() {
        super();
    }

    public Jaydeep getJaydeep() {
        return jaydeep;
    }

    //@Autowired   // :- for Setter Methods
    public void setJaydeep(Jaydeep jaydeep) {
        System.out.println("Using Setter Methods");
        this.jaydeep = jaydeep;
    }

    @Override
    public String toString() {
        return "Bhavikk{" +
                "jaydeep=" + jaydeep +
                '}';
    }
}
