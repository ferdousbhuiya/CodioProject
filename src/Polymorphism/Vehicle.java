package Polymorphism;


/**
 *
 *
 * Exercise 2
 * Vehicle is an abstract class.
 * Create the Airplane class as a subclass of Vehicle.
 * Extend and override Airplane as necessary to meet the criteria below.
 * The travel method should return the distance traveled by
 * the Airplane object.
 *
 */
abstract class Vehicle {
    public abstract double travel(double time);
}

//add class definitions below this line
class Airplane extends Vehicle {
    private double speed;

    public Airplane(double s) {
        speed = s;
    }

    public double travel(double time) {
        return speed * time;
    }
}


//add class definitions above this line

