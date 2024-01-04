package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        MenuItem item1 = new MenuItem(8.99, "Caesar Salad", "romaine lettuce, croutons, Parmesan cheese, and Caesar dressing",  true);
        MenuItem item2 = new MenuItem(14.99, "Kebab", "ground meat, vegetables ",  false);
        MenuItem item3 = new MenuItem(6.99, "Chocolate Mousse", "Dark Chocolate, Butter, Egg Yolk, Egg white, Sugar",  true);

        // Creating ArrayList to hold MenuItem instances
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(item1);
        menuItems.add(item2);
        menuItems.add(item3);

        // Creating a Date object for the last updated date
        Date lastUpdated = new Date();

        // Creating a Menu instance
        Menu menu = new Menu(lastUpdated, menuItems);

        // Printing the menu items and last updated date
        System.out.println("Menu Items:");
        for (MenuItem item : menu.getItems()) {
            System.out.println(item.getDescription() + " - $" + item.getPrice());
        }
        System.out.println("Last Updated: " + menu.getLastUpdated());
    }
}
