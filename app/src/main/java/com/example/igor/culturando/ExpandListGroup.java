package com.example.igor.culturando;

import java.util.ArrayList;

/**
 * Created by davitabosa on 10/01/17.
 */
public class ExpandListGroup {


    private String Name;
    private ArrayList<ExpandListChild> Items;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
    public ArrayList<ExpandListChild> getItems() {
        return Items;
    }

    public void setItems(ArrayList<ExpandListChild> items) {
        this.Items = items;
    }




}
