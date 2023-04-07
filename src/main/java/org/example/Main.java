package org.example;

import org.example.restaurant.Menu;
import org.example.restaurant.MenuItem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MenuItem firstItem=new MenuItem("pizza",50,"famouse food in palestine","main course");
        MenuItem secondItem=new MenuItem("chicken",50,"delisouis","main course");
        MenuItem thirdItem=new MenuItem("cake",25,"delisouis sweet","dessert");
        MenuItem forthItem=new MenuItem("nuts",30,"nice drink","dessert");
        MenuItem fifthItem=new MenuItem("corn salad",25,"tasty","appetizer");
       ////////////////////////////////////////////
        //create menu
        Menu menu=new Menu();
        ////////////////////////////////////////
        //add items to Menu
        menu.addItem(firstItem);
        menu.addItem(secondItem);
        menu.addItem(thirdItem);
        menu.addItem(fifthItem);
        menu.addItem(forthItem);

        //print the menu
        System.out.println(menu.toString());

        //print the single item
        //System.out.println(firstItem);

        // Delete from Menu and print it
        menu.removeItem(secondItem);

        //prevent the duplicate from being added to the menu
        menu.addItem(firstItem);

        //test is equal
        System.out.println(fifthItem.equals(firstItem));

        //check if third item  new or not
        boolean check= MenuItem.isNew(thirdItem);
        System.out.println("is the "+thirdItem.getName()+" New ?"+check);



    }
}