package OOPs;

/**
 *
 * Create the Atm class. This class has the attribute money that
 * gets its value as an argument from the constructor.
 * money - double that represents the amount of money in the account
 * This attribute should have a getter method, but not a setter.
 * The class should have two method, deposit and withdrawal.
 * The deposit method should contain data validation to check
 * if the amount of money deposited is positive. Print a message
 * if the data validation fails. The withdrawal method should check
 * the data to see if there is enough money to withdraw and that the
 * amount is positive. Print a message to the user if data validation
 * fails.
 */
class Atm {
    private double money;

    public Atm(double m) {
        money = m;
    }

    public double getMoney() {
        return money;
    }

    public void withdraw(double amount) {
        if (haveEnoughMoney(amount)) {
            if (positiveMoney(amount)) {
                money -= amount;
            } else {
                System.out.println("You cannot withdraw a negative amount of money.");
            }
        } else {
            System.out.println("You do not have enough funds to withdraw that amount.");
        }
    }

    public void deposit(double amount) {
        if (positiveMoney(amount)) {
            money += amount;
        } else {
            System.out.println("You cannot deposit a negative amount of money.");
        }
    }

    private boolean haveEnoughMoney(double amount) {
        return money > amount;
    }

    private boolean positiveMoney(double amount) {
        return amount >= 0;
    }
}
//add class definitions above this line

