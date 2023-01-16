package UserDefinedClass;

/**
 *
 * The BankAccount class is defined in the IDE to the left.
 * Create the toString method that returns a string
 * representation of a BankAccount object.
 */
class BankAccount {


    private double checking;
    private double savings;

    public BankAccount(double c, double s) {
        checking = c;
        savings = s;
    }

    //add toString definition below this line

    public String toString() {
        return getClass().getName() + String.format("[checking=" + checking + ", savings=" + savings + "]", checking, savings);
    }

    //add toString definition above this line

}

