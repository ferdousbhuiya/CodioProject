package OOPs;

/**
 *
 *Create the class SodaMachine which sells soda. Assume that this machine only takes
 * bills and that each can of soda costs $2. The class has the following attributes:
 * sodas - array of strings that represents the types of soda sold. It should be
 * initialized as {"coke", "pepsi", "sprite", "dr. pepper"}.
 * cokeInventory - integer representing how many cans of Coke are in the machine.
 * Start with 20.
 * pepsiInventory - integer representing how many cans of Pepsi are in the machine. Start with 20.
 * spriteInventory - integer representing how many cans of Sprite are in the machine. Start with 20.
 * drPepperInventory - integer representing how many cans of Dr. Pepper are in the machine. Start with 20.
 * money - integer representing how much money is in the machine. Start with $10.
 * Each attribute should have a getter and a setter.
 * In addition, buySoda is a public method.
 * This method takes a string that represents the type of soda to
 * purchase and the amount of money inserted in the machine.
 * The buySoda method should add the value of the soda ($2)
 * to the money attribute and update the inventory the particular soda.
 * It also needs to provide the following data validation:
 * Validate that the soda is sold by the machine;
 * provide a message to the user.
 * Validate that the user inserted enough money;
 * provide a message to the user.
 * Validate that there is enough cans of soda to be sold;
 * provide a message to the user.
 *
 */
class SodaMachine {
    private String[] sodas = {"coke", "pepsi", "sprite", "dr. pepper"};
    private int cokeInventory;
    private int pepsiInventory;
    private int spriteInventory;
    private int drPepperInventory;
    private int money;

    public SodaMachine() {
        cokeInventory = 20;
        pepsiInventory = 20;
        spriteInventory = 20;
        drPepperInventory = 20;
        money = 10;
    }

    public String[] getSodas() {
        return sodas;
    }

    public void setSodas(int index, String newSoda) {
        sodas[index] = newSoda;
    }

    public int getCokeInventory() {
        return cokeInventory;
    }

    public void setCokeInventory(int newInventory){
        cokeInventory = newInventory;
    }

    public int getPepsiInventory() {
        return pepsiInventory;
    }

    public void setPepsiInventory(int newInventory){
        pepsiInventory = newInventory;
    }

    public int getSpriteInventory() {
        return spriteInventory;
    }

    public void setSpriteInventory(int newInventory){
        spriteInventory = newInventory;
    }

    public int getDrPepperInventory() {
        return drPepperInventory;
    }

    public void setDrPepperInventory(int newInventory){
        drPepperInventory = newInventory;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int newMoney){
        money = newMoney;
    }

    public void buySoda(String soda, int amount) {
        if (validSoda(soda) && enoughSoda(soda) && enoughMoney(amount)) {
            updateInventory(soda);
            updateMoney();
        }
    }

    private boolean validSoda(String soda) {
        boolean correctSoda = false;

        for (String s : sodas) {
            if (soda.equals(s)) {
                correctSoda = true;
            }
        }

        if (correctSoda == false) {
            System.out.println("That soda is not sold in this machine.");
        }
        return correctSoda;
    }

    private boolean enoughMoney(int amount) {
        if (amount >= 2) {
            return true;
        } else {
            System.out.println("You did not insert enough money.");
            return false;
        }
    }

    private boolean enoughSoda(String soda) {
        if (soda.equals("coke")) {
            if (cokeInventory > 0) {
                return true;
            } else {
                System.out.println("There are no cans of Coke.");
                return false;
            }
        } else if (soda.equals("sprite")) {
            if (spriteInventory > 0) {
                return true;
            } else {
                System.out.println("There are no cans of Sprite.");
                return false;
            }
        } else if (soda.equals("pepsi")) {
            if (pepsiInventory > 0) {
                return true;
            } else {
                System.out.println("There are no cans of Pepsi.");
                return false;
            }
        } else if (soda.equals("dr. pepper")) {
            if (drPepperInventory > 0) {
                return true;
            } else {
                System.out.println("There are no cans of Dr. Pepper.");
                return false;
            }
        }
        return false;
    }

    private void updateInventory(String soda) {
        if (soda.equals("coke")) {
            cokeInventory--;
        } else if (soda.equals("sprite")) {
            spriteInventory--;
        } else if (soda.equals("pepsi")) {
            pepsiInventory--;
        } else if (soda.equals("dr. pepper")) {
            drPepperInventory--;
        }
    }

    private void updateMoney() {
        money += 2;
    }
}
//add class definitions above this line

