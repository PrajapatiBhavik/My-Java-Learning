package com.springframework.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person
{
    private List<String> friends;
    private Map<String,String> nickName;
    private Properties skills;

    public Person() {
        super();
    }

    public Person(List<String> friends, Map<String, String> nickName, Properties skills) {
        this.friends = friends;
        this.nickName = nickName;
        this.skills = skills;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, String> getNickName() {
        return nickName;
    }

    public void setNickName(Map<String, String> nickName) {
        this.nickName = nickName;
    }

    public Properties getSkills() {
        return skills;
    }

    public void setSkills(Properties skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", nickName=" + nickName +
                ", skills=" + skills +
                '}';
    }
}
