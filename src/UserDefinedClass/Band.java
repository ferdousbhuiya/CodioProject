package UserDefinedClass;

import java.util.Arrays;

/**
 *
 * Exercise 2
 * You have been given the class Band. Extend the class
 * such that it will produce a string representation of a Band object.
 */
public class Band {

    private String name;
    private String genre;
    private String[] members;

    public Band(String n, String g, String[]m) {
        name = n;
        genre = g;
        members = m;
    }

    //add method definition below this line

    public String toString() {
        String nameAttribute = "name=" + name + ", ";
        String genreAttribute = "genre=" + genre + ", ";
        String membersAttribute = "members=" + Arrays.toString(members);
        return getClass().getName() + "[" + nameAttribute + genreAttribute + membersAttribute + "]";
    }

    //add method definition above this line
}


