package ObjectExample;

/**
 *Define the class BigCat which will help record information on the animals in
 * the Panthera genus (tiger, lion, jaguar, leopard, and snow leopard).
 * Since all animals are in the same genus, the object should have the
 * class attribute genus with the value panthera. The constructor should accept
 * the following parameters (in this order):
 * species- String with the species of the animal, e.g. "tigris"
 * commonName - String with the common name of the animal, e.g. "tiger"
 * habitat - Array of strings with location of the animal, e.g. {"asia"}
 *
 *
 */

class BigCat {
    String species;
    String commonName;
    String[] habitat;
    static String genus = "panthera";

    public BigCat(String s, String c, String[] h) {
        species = s;
        commonName = c;
        habitat = h;
    }
}



public class Exercise5 {
    public static void main(String[] args) {

    }
}
