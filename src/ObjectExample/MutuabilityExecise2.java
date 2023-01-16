package ObjectExample;

/**
 * Using the same CelestialBody class, write a
 * static method closerToSun that compares two CelectialBody
 * objects and returns the name of the object that is closes to the sun.
 */


    //add class definitions below this line

    class CelestialBody1 {
        String name;
        double diameter;
        long distance;
        int moons;

        CelestialBody1(String n, double diam, long dist, int m) {
            name = n;
            diameter = diam;
            distance = dist;
            moons = m;
        }

        static String closerToSun(CelestialBody1 b1, CelestialBody1 b2) {
            if (b1.distance < b2.distance) {
                return b1.name;
            } else {
                return b2.name;
            }
        }
    }

//add class definitions above this line

    class Exercise20 {
        public static void main(String[] args) {

            //add code below this line

            CelestialBody1 mercury = new CelestialBody1("Mercury", 4879.4, 57909000, 0);
            CelestialBody1 venus = new CelestialBody1("Venus", 12103.6, 108160000, 0);
            String closest = CelestialBody1.closerToSun(mercury, venus);
            System.out.println(closest);

            //add code above this line
        }
    }

