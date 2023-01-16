package ObjectExample;

/**
 *
 * The code below creates the CelestialBody class as well as the external
 * method comparedToEarth. Transform the comparedToEarth method so that it
 * becomes an instance method of the CelestialBody class.
 */


class CelestialBody {
        String name;
        double diameter;
        long distance;
        int moons;

        CelestialBody(String n, double diam, long dist, int m) {
            name = n;
            diameter = diam;
            distance = dist;
            moons = m;
        }

        double comparedToEarth() {
            double earth = 12765.3;
            double relativeSize = diameter / earth;
            return relativeSize;
        }
    }


    class Exercise12 {
        public static void main(String[] args) {

            //add code below this line


            CelestialBody planet = new CelestialBody("Jupiter", 142984, 778360000L, 79);
            System.out.println(planet.comparedToEarth());

            //add code above this line
        }
    }

