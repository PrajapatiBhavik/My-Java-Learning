package com.springframwork.referencetypeDI;

public class Animal
{
    private String animalName;
    private Bird birdName;

    public Animal()
    {
        super();
    }

    public Animal(String animalName, Bird birdName) {
        this.animalName = animalName;
        this.birdName = birdName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public Bird getBirdName() {
        return birdName;
    }

    public void setBirdName(Bird birdName) {
        this.birdName = birdName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", birdName=" + birdName +
                '}';
    }
}
