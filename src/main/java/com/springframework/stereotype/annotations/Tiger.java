package com.springframework.stereotype.annotations;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("tiger_master") //String Value Are Optional  Like @Component()
//@Scope("prototype") //By Default Scope Is singleton
public class Tiger
{
    @Value("Rocky")
    private String tigerName;
    @Value("Gir Somnath")
    private String tigerLocation;

    public Tiger() {
        super();
    }

    public Tiger(String tigerName, String tigerLocation) {
        this.tigerName = tigerName;
        this.tigerLocation = tigerLocation;
    }

    public String getTigerName() {
        return tigerName;
    }

    public void setTigerName(String tigerName) {
        this.tigerName = tigerName;
    }

    public String getTigerLocation() {
        return tigerLocation;
    }

    public void setTigerLocation(String tigerLocation) {
        this.tigerLocation = tigerLocation;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "tigerName='" + tigerName + '\'' +
                ", tigerLocation='" + tigerLocation + '\'' +
                '}';
    }
}
