package UserDefinedClass;

import java.util.ArrayList;

public class Exercise3 {
    public static void main(String[] args) {

        //add code below this line

        ArrayList<Dog> dogs = makeDogs();
        System.out.println(dogs);
        //add code above this line

    }

    //add method definition below this line

    public static ArrayList<Dog> makeDogs() {
        ArrayList<Dog> dogs = new ArrayList<Dog>();

        dogs.add(new Dog("Marceline", "German Shepherd"));
        dogs.add(new Dog("Cajun", "Belgian Malinois"));
        dogs.add(new Dog("Daisy", "Border Collie"));
        dogs.add(new Dog("Rocky", "Golden Retriever"));
        dogs.add(new Dog("Bella", "Irish Setter"));

        return dogs;
    }
    //add method definition above this line
}
