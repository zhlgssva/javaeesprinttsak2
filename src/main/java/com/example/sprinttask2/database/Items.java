package com.example.sprinttask2.database;

public class Items {
    private Long id;
    private String name;
    private String description1;
    private String description2;
    private String description3;
    private double price;

    public Items() {
    }

    public Items(Long id, String name, String description1,String description2, String description3, double price) {
        this.id = id;
        this.name = name;
        this.description1 = description1;
        this.description2 = description2;
        this.description3 = description3;
        this.price = price;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String getDescription3() {
        return description3;
    }

    public void setDescription3(String description3) {
        this.description3 = description3;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description) {
        this.description1 = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
