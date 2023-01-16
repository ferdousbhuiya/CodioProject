package ObjectExample;

/**
 *
 * Define the class Observation which will help record observational data from a
 * scientific outpost in Antarctica. The class should have a constructor that
 * accepts parameters for date, temperature, elevation, and penguins.
 * There should also be an attribute for precipitation. Since Antarctica is a desert,
 * precipitation should default to 0.
 * date- String with the date of the observation, e.g. "October 26, 2019"
 * temperature - Double with the temperature in Celsius, e.g. -47
 * elevation - Double with elevation in meters, e.g. 329.4
 * penguins - Integer representing the number of penguins observed, e.g. 3
 * precipitation- Double with precipitation in centimeters, defaults to 0
 */

class Observation {
    String date;
    double temperature;
    double elevation;
    int penguines;
    double precipitation;


    public Observation(String dte, double tmp, double elv, int pngn) {

         date = dte;
        temperature = tmp;
        elevation = elv;
        penguines = pngn;
        precipitation =0;
    }
}

public class Exercise4 {
    public static void main(String[] args) {

    }
}
