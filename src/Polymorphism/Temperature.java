package Polymorphism;

/**
 *
 * The Temperature class is an abstract class with
 * two abstract methods. Create the Conversion class which
 * inherits from Temperature. Use the formulas below to
 * help with the temperature conversions.
 */
abstract class Temperature {
    public abstract double celsius(double temp);
    public abstract double fahrenheit(double temp);
}

//add class definitions below this line

class Conversion extends Temperature {
    public double celsius(double temp) {
        return (temp - 32) / 1.8;
    }

    public double fahrenheit(double temp) {
        return temp * 1.8 + 32;
    }

    public double convertTo(String unit, double temp) {
        if (unit.toLowerCase().equals("celsius")) {
            return celsius(temp);
        } else if (unit.toLowerCase().equals("fahrenheit")) {
            return fahrenheit(temp);
        }

        return 0;
    }
}

//add class definitions above this line

