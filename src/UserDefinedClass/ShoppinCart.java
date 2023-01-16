package UserDefinedClass;


import java.util.ArrayList;

/**
 *
 * Exercise 5
 *
 * You are going to write a program that simulates an online shopping
 * cart. Create the composite class ShoppingCart in the ShoppingCart.
 * java file, and create the component class Item in the Item.java file.
 * The tables below indicate which attributes and methods your
 * classes will need to create.
 * The Shopping Cart Class
 * Important, the ShoppingCart class should initialize the attributes
 * to either a 0 or an empty ArrayList. Your ShoppingCart class should
 * have the following attributes:
 * Attribute	Explanation
 * items	ArrayList of Item elements
 * total	Total value (double) of all of the items in the
 * shopping cart
 * It should also have the following methods:
 * Method	Explanation
 * public ShoppingCart	The constructor should not take any arguments
 * addItem	Add an item to the shopping cart and then calls the
 * calculateTotal method
 * calculateTotal	Assigns the total value of the shopping
 * cart to the total attribute
 * getTotal	Returns the total value of the shopping cart
 * getNumItems	Returns the number of items in the shopping cart
 * toString	Returns a human-readable string; see the Expected
 * Output section for the format
 * The Item Class
 * Important, the subtotal attribute is not passed to the
 * constructor. Initialize this attribute with a 0.
 * Your Item class should have the following attributes:
 * Attribute	Explanation
 * name	Name (string) of the item
 * price	How much (double) the item costs
 * quantity	How many (int) items you have
 * subtotal	Value (double) of all of the items
 * It should also have the following methods:
 * Method	Explanation
 * public Item	The order of the parameters should be name,
 * price, and then quantity
 * calculateSubtotal	Assigns the total value of the items
 * to the subtotal attribute
 * getSubtotal	Returns the subtotal attribute
 * toString	Returns a human-readable string; see the
 * Expected Output section for the format
 *
 */
class ShoppinCart {

    private ArrayList<Item> items;
    private double total;

    public void ShoppingCart() {
        items = new ArrayList<Item>();
        total = 0;
    }

    public void addItem(Item item) {
        items.add(item);
        calculateTotal();
    }

    private void calculateTotal() {
        total = 0;
        for (Item i : items) {
            i.calculateSubtotal();
            total += i.getSubtotal();
        }
    }

    public double getTotal() {
        return total;
    }

    public int getNumItems() {
        int numItems = 0;
        for (Item i : items) {
            numItems += i.getQuantity();
        }
        return numItems;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public String toString() {
        return getClass().getName() + "[items=" + items + ", total=" + total + "]";
    }
}

class Item {
    private String name;
    private double price;
    private int quantity;
    private double subtotal;

    public Item(String n, double p, int q) {
        name = n;
        price = p;
        quantity = q;
        subtotal = 0;
    }

    public int getQuantity() {
        return quantity;
    }

    public void calculateSubtotal() {
        subtotal = price * quantity;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public String toString() {
        return getClass().getName() + "[name=" + name + ", price=" + price + ", quantity=" + quantity + ", subtotal=" + subtotal + "]";
    }
}
