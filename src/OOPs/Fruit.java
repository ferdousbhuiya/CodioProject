package OOPs;

/**
 * To the left, you should see code for the Fruit class.
 * This class uses the default access modifier.
 * Convert this code so that it uses encapsulation.
 */
class Fruit {

    private String name;
    private String color;

    public Fruit(String n, String c) {
        name = n;
        color = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }
}


