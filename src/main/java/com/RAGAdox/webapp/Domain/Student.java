package com.RAGAdox.webapp.Domain;



public class Student {

    private long  id;
    private String name;
    protected Student(){}
    public Student(String name){
        this.name=name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
