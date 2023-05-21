package com.smartgroup;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ItemsList {

    private List<String> items = new ArrayList<>();

    public ItemsList() {}

    public void sortTheList() {
        items.sort(Comparator.naturalOrder());
    }

    public void addItems(String items) {
        String[] itemsArray = items.split(",");
        for(String item : itemsArray) {
            if(this.items.contains(item)) {
                System.out.println("-- " + item + " already in the list!");
            } else {
                this.items.add(item);
                System.out.println("-- " + item + " added to the list!");
            }
        }
        sortTheList();
        System.out.println(this.items);
    }

    public void removeItems(String items) {
        String[] itemsArray = items.split(",");
        for(String item : itemsArray) {
            if(!this.items.contains(item)) {
                System.out.println("-- " + item + " not in the list!");
            } else {
                this.items.remove(item);
                System.out.println(item + " removed from the list!");
            }
        }
        sortTheList();
        System.out.println(this.items);
    }

    public List<String> getItems() {
        return items;
    }
}
