package Inheritence;

/**
 *
 * Use the superclass Bank to help you solve this problem.
 * Note, the Bank class does not have a constructor, but it
 * does have getters and setters for each attribute. Create the
 * subclass RegionalBank so that it has the following attributes:
 * name - string that represents the name of the bank
 * customers - integer that represents the number of customers at the bank
 * regionalAccounts - 2D array of doubles that represent the amount of
 * money in the region
 * The RegionalBank class also has the method regionalTotal that
 * calculates the total amount of money stored in regionalAccounts.
 */
class Bank {

    private String name;
    private int customers;
    private double[] accounts;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getCustomers() {
        return customers;
    }

    public void setCustomers(int newCustomers) {
        customers = newCustomers;
    }

    public double[] getAccounts() {
        return accounts;
    }

    public void setAccounts(double[] newAccounts) {
        accounts = newAccounts;
    }

    public double branchTotal() {
        double total = 0;
        for (double account : accounts) {
            total += account;
        }
        return total;
    }
}

//add class definitions below this line
class RegionalBank extends Bank {
    public double[][] regionalAccounts;

    public RegionalBank(String n, int c, double[][] a) {
        setName(n);
        setCustomers(c);
        regionalAccounts = a;
    }

    public double[][] getRegionalAccounts() {
        return regionalAccounts;
    }

    public void setRegionalAccounts(double[][] newAccounts) {
        regionalAccounts = newAccounts;
    }

    public double regionalTotal() {
        double total = 0;
        for (double[] accounts : regionalAccounts) {
            setAccounts(accounts);
            total += branchTotal();
        }
        return total;
    }
}



//add class definitions above this line

