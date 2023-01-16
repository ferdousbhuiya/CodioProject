package Inheritence;

/**
 *
 *Use the Person class to the left to help you solve this problem.
 * First, create the CardHolder that inherits from the Person class.
 * It should have the following attributes and methods:
 * accountNumber - integer representing the credit card account.
 * balance - double representing how much money the holder owes.
 * creditLimit - integer representing how much the holder can spend.
 * Constructor - the constructor takes arguments for name, address,
 * and accountNumber. The balance should be set to 0 and creditLimit
 * should be set to 5000.
 * processSale - method that takes the sale amount (double) and adds
 * it to balance.
 * makePayment - method that takes an amount (double) and deducts it
 * from balance.
 * You also need to create the PlatinumClient class that inherits from
 * CardHolder. It should have the following attributes and methods:
 * cashBack - double representing the percentage of each sale the
 * holder gets back as a reward.
 * rewards - double representing how much money the holder has
 * earned as cash back.
 * Constructor - the constructor takes arguments for name,
 * address, and accountNumber. It should set cashBack
 * to 0.02 and set rewards to 0.
 * processSale - override the method so that it adds the
 * sale amount (double) to balance and 2% of each
 * sale is added to rewards.
 *
 */
public class Person {
    private String name;
    private String address;

    public Person(String n, String a) {
        name = n;
        address = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public String info() {
        return name + " lives at " + address + ".";
    }
}

//add class definitions below this line

class CardHolder extends Person {
    private int accountNumber;
    private double balance;
    private int creditLimit;

    public CardHolder(String n, String a, int an) {
        super(n, a);
        accountNumber = an;
        balance = 0;
        creditLimit = 5000;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int newAccountNumber) {
        accountNumber = newAccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int newCreditLimit) {
        creditLimit = newCreditLimit;
    }

    public void processSale(double price) {
        balance += price;
    }

    public void makePayment(double amount) {
        balance -= amount;
    }
}

class PlatinumClient extends CardHolder {
    private double cashBack;
    private double rewards;

    public PlatinumClient(String n, String a, int an) {
        super(n, a, an);
        cashBack = 0.02;
        rewards = 0;
    }

    public double getCashBack() {
        return cashBack;
    }

    public void setCashBack(double newCashBack) {
        cashBack = newCashBack;
    }

    public double getRewards() {
        return rewards;
    }

    public void setRewards(double newRewards) {
        rewards = newRewards;
    }

    public void processSale(double price) {
        rewards += cashBack * price;
        setBalance(getBalance() + price);
    }
}


//add class definitions above this line

