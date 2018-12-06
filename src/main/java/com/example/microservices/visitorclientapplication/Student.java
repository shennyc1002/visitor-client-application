package com.example.microservices.visitorclientapplication;

public class Student {

    private int id;
    private String name;
    private String course;
    private  String country;


    public Student(int id, String name, String course, String country)
    {
        this.id=id;
        this.name=name;
        this.course=course;
        this.country=country;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
