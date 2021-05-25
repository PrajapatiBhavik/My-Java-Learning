package com.springframwork.referencetypeDI;

public class Bird
{
    private String birdName;

    public Bird()
    {
        super();
    }

    public Bird(String birdName) {
        this.birdName = birdName;
    }

    public String getBirdName() {
        return birdName;
    }

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "birdName='" + birdName + '\'' +
                '}';
    }
}
