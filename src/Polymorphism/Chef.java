package Polymorphism;


/**
 *
 * Problem
 * In the IDE to the left, the class Chef is
 * already defined, as is the display method. However,
 * it does not have a constructor. Create three constructors
 * that take one, two, and three parameters respectively.
 */
class Chef {
        private String name;
        private String cuisine;
        private int michelinStars;

        //add constructors below this line

    public Chef(String n) {
        name = n;
    }

    public Chef(String n, String c) {
        name = n;
        cuisine = c;
    }

    public Chef(String n, String c, int s) {
        name = n;
        cuisine = c;
        michelinStars = s;
    }

        //add constructors above this line

        public String display() {
            String msg = String.format("%s is known for %s cuisine and has %d Michelin stars.", name, cuisine, michelinStars);
            return msg;
        }
    }

