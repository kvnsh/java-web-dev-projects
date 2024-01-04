import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Creating some sample menu items
        MenuItem item1 = new MenuItem("caesar salad", 8.99, "romaine lettuce, croutons, Parmesan cheese, and Caesar dressing", "Appetizer", true, new Date());
        MenuItem item2 = new MenuItem("Kabab", 14.99, "ground meat, vegetables ", "Main Course", false, new Date());
        MenuItem item3 = new MenuItem("", 6.99, "", "Dessert", true, new Date());

        // Creating a menu and adding the items
        Menu menu = new Menu();
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);

        // Printing the entire menu
        System.out.println("Full Menu:");
        menu.printMenu();

        // Printing an individual menu item
        System.out.println("\nIndividual Menu Item:");
        menu.printMenuItem(item1);

        // Removing an item from the menu
        menu.removeItem(item2);

        // Reprinting the updated menu
        System.out.println("\nUpdated Menu:");
        menu.printMenu();
    }
}
