package com.springframework.lifecycle;

public class Pepsi
{
    private String pepsiMl;
    private double pepsiPrice;
    private String pepsiMadeLocation;

    public String getPepsiMl() {
        return pepsiMl;
    }

    public void setPepsiMl(String pepsiMl) {
        this.pepsiMl = pepsiMl;
    }

    public double getPepsiPrice() {
        return pepsiPrice;
    }

    public void setPepsiPrice(double pepsiPrice) {
        this.pepsiPrice = pepsiPrice;
    }

    public String getPepsiMadeLocation() {
        return pepsiMadeLocation;
    }

    public void setPepsiMadeLocation(String pepsiMadeLocation) {
        this.pepsiMadeLocation = pepsiMadeLocation;
    }

    public void init()
    {
        System.out.println("init() Method Called");
    }

    public void destroy()
    {
        System.out.println("destroy() Method Called");
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "pepsiMl='" + pepsiMl + '\'' +
                ", pepsiPrice=" + pepsiPrice +
                ", pepsiMadeLocation='" + pepsiMadeLocation + '\'' +
                '}';
    }
}
