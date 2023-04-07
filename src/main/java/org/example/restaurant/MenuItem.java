package org.example.restaurant;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;

    public Date getDate() {
        return date;
    }

    private Date date;
    public MenuItem(String aName,double cost,String descr,String catagory){
        this.name=aName;
        this.price=cost;
        this.description=descr;
        this.category=catagory;
        this.date=new Date();
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(obj ==null)
            return false;
        if(getClass()!=obj.getClass())
            return false;
        MenuItem newItem=(MenuItem) obj;

            return this.name.equals(newItem.getName());
    }



    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", price=" + price +"$"+
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", date=" + date
              ;
    }
public static boolean isNew(MenuItem item){
Date todayDate=new Date();
//    SimpleDateFormat formatDate1 = new SimpleDateFormat(
//            "YYY");
//    if(formatDate1.format(item.getDate()).equals(formatDate1.format(todayDate))){
        SimpleDateFormat formatDate = new SimpleDateFormat(
                "MM");
        // does not new if more then 90 days ==3 months
        if(Math.subtractExact(Integer.parseInt(formatDate.format(todayDate)),Integer.parseInt(formatDate.format(item.getDate())))>3)
            return false;
        else
            return true;
    }
    //if not same year
//    else{
//        if(Math.subtractExact(Integer.parseInt(formatDate1.format(todayDate)),Integer.parseInt(formatDate1.format(item.getDate())))>1)
//        return false;
//        else{
//            SimpleDateFormat format = new SimpleDateFormat(
//                    "MM");
//            if(Math.subtractExact(Integer.parseInt(format.format(todayDate)),Integer.parseInt(format.format(item.getDate())))>3)
//                return false;
//            else
//                return true;
//
//        }
//    }
//    }

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
