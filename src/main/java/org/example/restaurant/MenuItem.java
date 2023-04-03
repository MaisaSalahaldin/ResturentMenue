package org.example.restaurant;

import java.util.Date;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private Date date;
    public MenuItem(String aName,double cost,String descr,String catagory){
        this.name=aName;
        this.price=cost;
        this.description=descr;
        this.category=catagory;
        this.date=new Date();
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }



}
