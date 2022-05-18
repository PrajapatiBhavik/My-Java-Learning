package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person
{
    private String firstName;
    private List<String> nLaptops;
    private Set<String> nAddress;
    private Map<String,String> nickName;
    private Properties gamePerson;

    public Person() {
        super();
    }

    public Person(String fName, List<String> nLaptops, Set<String> nAddress, Map<String, String> nickName, Properties gamePerson) {
        this.fName = fName;
        this.nLaptops = nLaptops;
        this.nAddress = nAddress;
        this.nickName = nickName;
        this.gamePerson = gamePerson;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public List<String> getnLaptops() {
        return nLaptops;
    }

    public void setnLaptops(List<String> nLaptops) {
        this.nLaptops = nLaptops;
    }

    public Set<String> getnAddress() {
        return nAddress;
    }

    public void setnAddress(Set<String> nAddress) {
        this.nAddress = nAddress;
    }

    public Map<String, String> getNickName() {
        return nickName;
    }

    public void setNickName(Map<String, String> nickName) {
        this.nickName = nickName;
    }

    public Properties getGamePerson() {
        return gamePerson;
    }

    public void setGamePerson(Properties gamePerson) {
        this.gamePerson = gamePerson;
    }
}
