package com.springframwork.autowiring;

public class Person
{
    private String personName;
    private Address address;

    public Person() {
        super();
    }

    public Person(String personName, Address address) {
        this.personName = personName;
        this.address = address;
        System.out.println("Person() Constructor Called");
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", address=" + address +
                '}';
    }
}
