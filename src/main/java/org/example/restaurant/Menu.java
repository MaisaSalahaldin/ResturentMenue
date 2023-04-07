package org.example.restaurant;

import javax.swing.text.TabExpander;
import javax.swing.text.TabableView;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    public  ArrayList<MenuItem> items=new ArrayList<>();
    public Date lastUpdateDate;
    public  void addItem(MenuItem item){
        if(items.contains(item)) {
        System.out.println("You tried to add the item already Exiest");
        return;
        }
        for(MenuItem itms:items){
            if(itms.equals(item)){
                System.out.println("You tried to add the item already Exiest");
                return;
            }
        }
        this.items.add(item);
        this.lastUpdateDate=new Date();
    }
    public  void removeItem(MenuItem item){
        this.items.remove(item);
        this.lastUpdateDate=new Date();

    }

    @Override
    public String toString() {
        StringBuffer Appetizerbuff=new StringBuffer();
        StringBuffer mainCourserbuff=new StringBuffer();
        StringBuffer dessertbuff=new StringBuffer();
        for(MenuItem item:items)
        {
            if(item.getCategory().equals("appetizer"))
                Appetizerbuff.append("\n"+item.toString());

           else if(item.getCategory().equals("main course"))
                mainCourserbuff.append("\n"+item.toString());
           else if(item.getCategory().equals("dessert"))
                dessertbuff.append("\n"+item.toString());


        }


        return "|Maisa Menu|" +
                "\nAppetizer=" + Appetizerbuff.toString() +
                "\nMain Course="+mainCourserbuff.toString()+
                "\nDessert="+dessertbuff.toString();

    }


}
