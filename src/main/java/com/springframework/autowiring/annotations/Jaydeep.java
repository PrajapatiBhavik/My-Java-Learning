package com.springframework.autowiring.annotations;

public class Jaydeep
{
    private String relation;

    public Jaydeep() {
        super();
    }

    public Jaydeep(String relation) {
        this.relation = relation;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    @Override
    public String toString() {
        return "Jaydeep{" +
                "relation='" + relation + '\'' +
                '}';
    }
}
