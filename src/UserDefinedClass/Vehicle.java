package UserDefinedClass;

/**
 *
 * Exercise 1
 * The Vehicle interface has already been defined
 * in the IDE to the left. Create the Car, RideShare,
 * and Subway classes that inherit from Vehicle.
 * The table below describes the constructor for each class.
 */
interface Vehicle {

    String travel();
}

//add class definitions below this line

class Car implements Vehicle {
    private double miles;

    public Car(double m) {
        miles = m;
    }

    public String travel() {
        return String.format("There is no extra fee to travel %.2f miles.", miles);
    }
}

class RideShare implements Vehicle {
    private double miles;
    private double fee;

    public RideShare(double m, double f) {
        miles = m;
        fee = f;
    }

    public String travel() {
        return String.format("It costs $%.2f to travel %.2f miles.", (fee * miles), miles);
    }
}

class Subway implements Vehicle {
    private double fare;

    public Subway(double f) {
        fare = f;
    }

    public String travel() {
        return String.format("$%.2f will get you unlimited use for one day.", fare);
    }
}

//add class definitions above this line

