package Polymorphism;

public class Exercise3 {
    public static void main(String[] args) {

        //add code below this line
        Conversion c = new Conversion();
        System.out.println(c.convertTo("Celsius", 212.0));
        System.out.println(c.convertTo("CELSIUS", 78.0));
        System.out.println(c.convertTo("celsius", 23.0));
        System.out.println(c.convertTo("Fahrenheit", 0.0));
        System.out.println(c.convertTo("FAHRENHEIT", 29.0));
        System.out.println(c.convertTo("fahrenheit", 112.0));

        //add code above this line
    }

}
