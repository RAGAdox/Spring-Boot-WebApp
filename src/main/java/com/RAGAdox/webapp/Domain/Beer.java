package com.RAGAdox.webapp.Domain;





public class Beer{
    private String name;
    public Beer(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Beer [name=" + name + "]";
    }
}