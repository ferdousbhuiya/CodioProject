package ObjectExample;

/**
 *
 * Define the class Superhero. The class should have a constructor
 * that accepts the following arguments (in this order):
 * name- String with the name of the super hero, e.g. "Spider-Man"
 * secretIdentity - String with the true name of the hero, e.g. "Peter Parker"
 * powers - An array of strings with each element representing a power, e.g.
 *
 * {"superhuman strength", "superhuman speed", "superhuman reflexes", "superhuman durability", "healing factor", "spider-sense alert", "heightened senses", "wallcrawling"}
 */

class Superhero {
    String name;
    String secretIdentity;
    String[] powers;

    public Superhero(String n, String s, String[] p) {
        name = n;
        secretIdentity = s;
        powers = p;
    }
}

public class Exercise3 {
    public static void main(String[] args) {

    }
}
