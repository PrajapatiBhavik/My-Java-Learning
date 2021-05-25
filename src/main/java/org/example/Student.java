package org.example;

public class Student
{
    private String id;
    private String name;
    private String address;

    public Student(String id, String name, String address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public Student()
    {
        super();
    }
    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        System.out.println("Setting The Id");
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        System.out.println("Setting The Name");
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        System.out.println("Setting The Address");
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
